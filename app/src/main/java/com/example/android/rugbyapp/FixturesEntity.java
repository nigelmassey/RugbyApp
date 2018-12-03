package com.example.android.rugbyapp;

import java.util.Date;
import java.util.List;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "fixtures")
public class FixturesEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String hometeam;
    private String awayteam;
    private int homescore;
    private int awayscore;
    private String location;
    private Date kickoff;

    public int getId() {
        return id;
    }

    public String getHometeam() {
        return hometeam;
    }

    public void setHometeam(String hometeam) {
        this.hometeam = hometeam;
    }

    public String getAwayteam() {
        return awayteam;
    }

    public void setAwayteam(String awayteam) {
        this.awayteam = awayteam;
    }

    public int getHomescore() {
        return homescore;
    }

    public void setHomescore(int homescore) {
        this.homescore = homescore;
    }

    public int getAwayscore() {
        return awayscore;
    }

    public void setAwayscore(int awayscore) {
        this.awayscore = awayscore;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getKickoff() {
        return kickoff;
    }

    public void setKickoff(Date kickoff) {
        this.kickoff = kickoff;
    }

}
