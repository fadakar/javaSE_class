package com.grf.db.Utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;

public abstract class BaseDA<T> {

    protected String table = "";
    protected String primaryKey = "id";
    protected ArrayList<String> fields;

    public ArrayList<T> all() throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from " + table);
        ArrayList<T> items = new ArrayList<>();

        try {
            while (rs.next()) {
                T item = newInstance();
                fillItem(rs, item); // fill all fields from result set
                items.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection(connection);
        return items;
    }

    public T find(int id) throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM " + table + " WHERE " + primaryKey + " = " + id);
        T item = newInstance();
        try {
            rs.next();
            fillItem(rs, item); // fill all fields from result set
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection(connection);
        return item;
    }

    public void add(T item) throws SQLException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Connection connection = createConnection();
        String fieldNames = "";
        String values = "";
        for (String field : fields) {
            fieldNames += field + ",";

            field = field.substring(0, 1).toUpperCase() + field.substring(1); // capitalize field name from id to Id
            Method method = item.getClass().getMethod("get" + field); // get SetName method for example
            method.setAccessible(true); // This is important if you want to access protected or private method. For public method you can skip
            Object value = method.invoke(item);
            if (value instanceof Integer) {
                values += value + ",";
            } else if (value instanceof String) {
                values += "'" + value + "',";
            }
        }
        fieldNames = fieldNames.substring(0, fieldNames.length() - 1); // remove last ,
        values = values.substring(0, values.length() - 1); // remove last ,
        PreparedStatement st = connection.prepareStatement("insert into " + table + "(" + fieldNames + ") values(" + values + ")");
        st.executeUpdate();
        closeConnection(connection);
    }

    public void update(T item) throws SQLException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Connection connection = createConnection();
        String fieldNames = "";
        Object pkValue = "";
        String values = "";
        for (String field : fields) {
            field = field.substring(0, 1).toUpperCase() + field.substring(1); // capitalize field name from id to Id
            Method method = item.getClass().getMethod("get" + field); // get SetName method for example
            method.setAccessible(true); // This is important if you want to access protected or private method. For public method you can skip
            Object value = method.invoke(item);

            if (field.toLowerCase().equals(primaryKey)) {
                pkValue = value;
                continue;
            }

            if (value instanceof Integer) {
                values += field + "=" + values + ",";
            } else if (value instanceof String) {
                values += field + "='" + value + "',";
            }

        }
        values = values.substring(0, values.length() - 1); // remove last ,
        PreparedStatement st = connection.prepareStatement("UPDATE " + table + " SET " + values + "WHERE " + primaryKey + "=" + pkValue.toString());
        st.executeUpdate();
        closeConnection(connection);
    }

    public void delete(int id) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement st = connection.prepareStatement("delete from person where " + primaryKey + "=?");
        st.setInt(1, id);
        st.executeUpdate();
        closeConnection(connection);
    }

    private void fillItem(ResultSet resultSet, T item) throws SQLException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int columnCount = rsmd.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            int columnType = rsmd.getColumnType(i);
            String columnName = rsmd.getColumnName(i);
            columnName = columnName.substring(0, 1).toUpperCase() + columnName.substring(1); // capitalize field name from id to Id
            Method method;

            switch (columnType) {
                case 4: // int
                    method = item.getClass().getMethod("set" + columnName, int.class); // get SetName method for example
                    method.setAccessible(true); // This is important if you want to access protected or private method. For public method you can skip
                    method.invoke(item, resultSet.getInt(i));
                    break;
                case 12: // varchar
                    method = item.getClass().getMethod("set" + columnName, String.class); // get SetName method for example
                    method.setAccessible(true); // This is important if you want to access protected or private method. For public method you can skip
                    method.invoke(item, resultSet.getString(i));
                    break;
            }
        }
    }

    protected abstract Connection createConnection() throws SQLException;

    protected abstract T newInstance();

    protected void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
