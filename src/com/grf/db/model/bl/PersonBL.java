package com.grf.db.model.bl;

import com.grf.db.model.to.Person;
import com.grf.db.model.da.PersonDA;

import java.sql.SQLException;
import java.util.ArrayList;

public class PersonBL {

    public ArrayList<Person> all() throws SQLException, ClassNotFoundException {
        PersonDA personDA = new PersonDA();
        return personDA.all();
    }

    public void add(Person person) throws SQLException, ClassNotFoundException {
        PersonDA personDA = new PersonDA();
        personDA.add(person);
    }

    public  void update(Person person) throws SQLException, ClassNotFoundException {
        PersonDA personDA = new PersonDA();
        personDA.update(person);
    }

    public void delete(int id) throws SQLException, ClassNotFoundException {
        PersonDA personDA = new PersonDA();
        personDA.delete(id);
    }
}
