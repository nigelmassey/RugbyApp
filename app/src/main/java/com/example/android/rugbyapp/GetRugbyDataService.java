package com.example.android.rugbyapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetRugbyDataService {

    @GET("/fixtures")
    Call<List<FixtureModel>> getFixtures();

}
