package com.grf.db.model.bl;

import com.grf.db.model.da.PersonDA;
import com.grf.db.model.to.Person;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonBL {

    private PersonDA personDA;

    public PersonBL() throws ClassNotFoundException {
        personDA = new PersonDA();
    }

    public ArrayList<Person> all() throws SQLException {
        return personDA.all();
    }

    public Person find(int id) throws SQLException {
        return personDA.find(id);
    }

    public void add(Person person) throws SQLException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        personDA.add(person);
    }

    public void update(Person person) throws SQLException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        personDA.update(person);
    }

    public void delete(int id) throws SQLException {
        personDA.delete(id);
    }

    public ArrayList<Person> searchByName(String name) throws SQLException {
        return personDA.searchByName(name);
    }

    public ArrayList<Person> searchByNumber(String number) throws SQLException {
        return personDA.searchByNumber(number);
    }
}
