package com.example.android.rugbyapp;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FixturesAdapter extends RecyclerView.Adapter<FixturesAdapter.ViewHolder> {
    private static final String TAG = "FixturesAdapter";

    private String[] mDataSet;

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView homeTeamName;
        private final TextView awayTeamName;
        private final TextView homeTeamScore;
        private final TextView awayTeamScore;

        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
                }
            });
            homeTeamName = (TextView) v.findViewById(R.id.home_team_name);
            awayTeamName = (TextView) v.findViewById(R.id.away_team_name);
            homeTeamScore = (TextView) v.findViewById(R.id.home_team_score);
            awayTeamScore = (TextView) v.findViewById(R.id.away_team_score);
        }

        public TextView getHomeTeamName() {return homeTeamName;}
        public TextView getAwayTeamName() {return awayTeamName;}
        public TextView getHomeTeamScore() {return homeTeamScore;}
        public TextView getAwayTeamScore() {return awayTeamScore;}
    }

    public FixturesAdapter(String[] dataSet) {mDataSet = dataSet;}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.fixture_row_item, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.getHomeTeamName().setText(mDataSet[position]);
        viewHolder.getAwayTeamName().setText(mDataSet[position]);
        viewHolder.getHomeTeamScore().setText(mDataSet[position]);
        viewHolder.getAwayTeamScore().setText(mDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
