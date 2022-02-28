package com.example.noteapprealm.manager;

import com.example.noteapprealm.model.Note;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmManager {
    static RealmManager realmManager;
    static Realm realm;

    static RealmManager getInstance() {
        if (realmManager == null) {
            realmManager = new RealmManager();
        }
        return realmManager;
    }

    public RealmManager() {
        realm = Realm.getDefaultInstance();
    }

    void save(Note note) {
        realm.beginTransaction();
        realm.copyToRealm(note);
        realm.commitTransaction();
    }

    ArrayList<Note> loadNotes() {
        RealmResults<Note> results = realm.where(Note.class).findAll();

        ArrayList<Note> notes = new ArrayList<>(results);

        return notes;
    }
}
