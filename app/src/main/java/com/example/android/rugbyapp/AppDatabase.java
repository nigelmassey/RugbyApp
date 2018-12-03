package com.example.android.rugbyapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

    @Database(entities = {FixturesEntity.class}, version = 1)
    public abstract class AppDatabase extends RoomDatabase {

        private static AppDatabase sInstance;
        public abstract FixturesDao fixturesDao();

        public static AppDatabase getInstance(Context context){
            if (sInstance == null){
                sInstance = Room.databaseBuilder(context, AppDatabase.class, "RugbyDatabase")
                        .fallbackToDestructiveMigration()
                        .build();
            }
            return sInstance;
        }
    }
