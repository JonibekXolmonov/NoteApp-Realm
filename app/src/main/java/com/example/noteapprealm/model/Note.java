package com.example.noteapprealm.model;


import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Note extends RealmObject {
    @PrimaryKey
    int id;
    String data;
    String description;

    public Note(String data, String description) {
        this.data = data;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Note{" +
                "data='" + data + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
