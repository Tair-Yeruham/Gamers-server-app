package com.example.finallproject;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    String Id;
    String Email;
    String Phone;
    List<String> gameList;

    public List<String> getGameList() {
        return gameList;
    }

    public Person()
    {

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public Person(String name, String id, String email) {
        this.name = name;
        Id = id;
        Email = email;
        gameList = new ArrayList<String>();
    }


}
