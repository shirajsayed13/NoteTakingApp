package com.shiraj.notetakingapp.persistence;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.shiraj.notetakingapp.models.Note;

@Database(entities = {Note.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {

    public static final String DATABASE_NAME = "note_db";

    public abstract NoteDao getNoteDao();
}
