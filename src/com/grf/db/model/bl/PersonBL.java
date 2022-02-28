package com.grf.db.model.bl;

import com.grf.db.model.da.PersonDA;
import com.grf.db.model.to.Person;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PersonBL {

    private PersonDA personDA;

    public PersonBL() throws ClassNotFoundException {
        personDA = new PersonDA();
    }

    public ArrayList<Person> all(int userId) throws SQLException {
        return (ArrayList<Person>) personDA.all()
                .stream()
                .filter(x -> x.getUserId() == userId)
                .collect(Collectors.toList());
    }

    public Person find(int id, int userId) throws SQLException {
        Person person = personDA.find(id);
        if (person != null && person.getUserId() == userId) {
            return person;
        }
        return null;
    }

    public void add(Person person) throws SQLException {
        personDA.add(person);
    }

    public void update(Person person, int userId) throws SQLException {
        if (person != null && person.getUserId() == userId) {
            personDA.update(person);
        }
    }

    public void delete(int id, int userId) throws SQLException {
        personDA.deleteByIdAndUserId(id, userId);
    }

    public ArrayList<Person> searchByName(String name) throws SQLException {
        return personDA.searchByName(name);
    }

    public ArrayList<Person> searchByNumber(String number) throws SQLException {
        return personDA.searchByNumber(number);
    }
}
