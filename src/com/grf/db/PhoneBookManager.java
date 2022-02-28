package com.grf.db;

import com.grf.db.Auth.Auth;
import com.grf.db.model.DTO.UserRegisterDTO;
import com.grf.db.model.bl.PersonBL;
import com.grf.db.model.to.Person;
import com.grf.db.model.to.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookManager {

    private Scanner scanner = new Scanner(System.in);
    private PersonBL personBL;
    private Auth auth;

    public PhoneBookManager() throws ClassNotFoundException {
        personBL = new PersonBL();
        auth = new Auth();
    }


    public void run() throws SQLException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Person person;
        ArrayList<Person> people;

        while (true) {
            if (auth.check()) {
                switch (showMainMenu()) {
                    case 1:
                        try {
                            ArrayList<Person> persons = personBL.all(auth.getId());
                            if (persons.size() == 0) {
                                System.out.println("[info] Your Contact List Is Empty");
                            } else {
                                for (Person item : persons) {
                                    System.out.println(item);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        switch (searchMenu()) {
                            case 1:
                                int id = searchByIdAction();
                                person = personBL.find(id, auth.getId());
                                if (person != null) {
                                    System.out.println("Founded: " + person);
                                }
                                break;
                            case 2:
                                String name = searchByNameAction();
                                people = personBL.searchByName(name);
                                for (Person item : people) {
                                    System.out.println("Founded: " + item);
                                }
                                break;
                            case 3:
                                String number = searchByNumberAction();
                                people = personBL.searchByNumber(number);
                                for (Person item : people) {
                                    System.out.println("Founded: " + item);
                                }
                                break;
                            case 4:
                                break;
                        }
                        break;
                    case 3:
                        try {
                            person = addPersonAction();
                            person.setUserId(auth.getId());
                            personBL.add(person);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        person = editPersonAction();
                        personBL.update(person, auth.getId());
                        break;
                    case 5:
                        try {
                            int id = deletePersonAction();
                            Person findPerson = personBL.find(id, auth.getId());
                            if (findPerson != null) {
                                personBL.delete(id, auth.getId());
                            } else {
                                System.out.println("[error] Contact not found");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 6:
                        auth.logout();
                        break;
                }
            } else {
                switch (showAuthMenu()) {
                    case 1:
                        User user = showAuthLoginAction();
                        boolean isLogin = auth.login(user.getUsername(), user.getPassword());
                        if (!isLogin) {
                            System.out.println("[error] Username or password is incorrect");
                        }
                        break;
                    case 2:
                        UserRegisterDTO userRegisterDTO = showAuthRegisterAction();
                        
                        // check user not exists
                        if (auth.hasUser(userRegisterDTO.getUsername())) {
                            System.out.println("[error] username " + userRegisterDTO.getUsername() + " is already exist, try login");
                            break;
                        }

                        // check password and repassword
                        if (!userRegisterDTO.getPassword().equals(userRegisterDTO.getRepassword())) {
                            System.out.println("[error] Entered password not same, please try again");
                            break;
                        }

                        // create new user
                        auth.register(userRegisterDTO.getUsername(), userRegisterDTO.getPassword());
                        System.out.println("You are registered, you can login now");
                        break;
                    case 3:
                        System.exit(0);
                }
            }

        }
    }


    public int showAuthMenu() {
        System.out.println("--------------------------");
        System.out.println("[1] Login");
        System.out.println("[2] Register");
        System.out.println("[3] Exit");
        System.out.print(": ");
        return scanner.nextInt();
    }

    public User showAuthLoginAction() {
        User user = new User();
        System.out.println("--------------------------");
        System.out.print("[1] Enter Username:");
        user.setUsername(scanner.next());
        System.out.print("[1] Enter Password:");
        user.setPassword(scanner.next());
        return user;
    }

    public UserRegisterDTO showAuthRegisterAction() {
        UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
        System.out.println("--------------------------");
        System.out.print("[1] Enter Username:");
        userRegisterDTO.setUsername(scanner.next());
        System.out.print("[1] Enter Password:");
        userRegisterDTO.setPassword(scanner.next());
        System.out.print("[1] Enter Password again:");
        userRegisterDTO.setRepassword(scanner.next());
        return userRegisterDTO;
    }

    public int showMainMenu() {
        System.out.println("--------------------------");
        System.out.println("[1] Show all");
        System.out.println("[2] Search");
        System.out.println("[3] Add");
        System.out.println("[4] Edit");
        System.out.println("[5] Delete");
        System.out.println("[6] Logout");
        System.out.print(": ");
        return scanner.nextInt();
    }

    public Person addPersonAction() {
        Person person = new Person();
        System.out.print("Enter name: ");
        person.setName(scanner.next());
        System.out.print("Enter number: ");
        person.setNumber(scanner.next());
        return person;
    }


    public Person editPersonAction() throws SQLException {
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        Person person = personBL.find(id, auth.getId());
        if (person != null) {
            System.out.print("Enter name:");
            person.setName(scanner.next());
            System.out.print("Enter number: ");
            person.setNumber(scanner.next());
        } else {
            System.out.println("[error] Contact not found");
        }
        return person;
    }


    public int deletePersonAction() {
        System.out.print("Enter id: ");
        return scanner.nextInt();
    }

    public int searchMenu() {
        System.out.println("--------------------------");
        System.out.println("[1] By id");
        System.out.println("[2] By name");
        System.out.println("[3] By number");
        System.out.println("[4] back");
        System.out.print(": ");
        return scanner.nextInt();
    }

    public int searchByIdAction() {
        System.out.print("Enter id: ");
        return scanner.nextInt();
    }

    public String searchByNameAction() {
        System.out.print("Enter name: ");
        return scanner.next();
    }

    public String searchByNumberAction() {
        System.out.print("Enter number: ");
        return scanner.next();
    }


}
