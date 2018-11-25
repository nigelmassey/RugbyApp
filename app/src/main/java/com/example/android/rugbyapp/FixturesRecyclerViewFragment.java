package com.example.android.rugbyapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FixturesRecyclerViewFragment extends Fragment {

    private static final int DATASET_COUNT = 60;

    protected RecyclerView mRecyclerView;
    protected FixturesAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected String[] mDataset;
    protected List<FixtureModel> mfixtureData;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataset();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fixtures, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(getActivity());

        setRecyclerViewLayoutManager();

        mAdapter = new FixturesAdapter(mfixtureData);

        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

    public void setRecyclerViewLayoutManager() {
        int scrollPosition = 0;

        // If a layout manager has already been set, get current scroll position.
        if (mRecyclerView.getLayoutManager() != null) {
            scrollPosition = ((LinearLayoutManager) mRecyclerView.getLayoutManager())
                    .findFirstCompletelyVisibleItemPosition();
        }

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.scrollToPosition(scrollPosition);
    }

    private void initDataset() {
        mDataset = new String[DATASET_COUNT];
        mfixtureData = new ArrayList<>();

        for (int i = 0; i < DATASET_COUNT; i++) {
            mDataset[i] = "This is element #" + i;
            FixtureModel fixtures = new FixtureModel();
            fixtures.setHomeTeamName("Home Team "+i);
            fixtures.setAwayTeamName("Away Team "+i);
            fixtures.setHomeTeamScore(String.valueOf(i));
            fixtures.setAwayTeamScore(String.valueOf(i));
            mfixtureData.add(fixtures);
        }
    }
}
