package com.example.android.rugbyapp;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface FixturesDao {

    @Query("SELECT * FROM fixtures")
    List<FixturesEntity> getAll();

    @Insert
    void insertAll(FixturesEntity... fixtures);


}
