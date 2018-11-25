package com.example.android.rugbyapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            FixturesRecyclerViewFragment fragment = new FixturesRecyclerViewFragment();
            transaction.replace(R.id.recycler_view_content_frag, fragment);
            transaction.commit();
        }
    }
}
