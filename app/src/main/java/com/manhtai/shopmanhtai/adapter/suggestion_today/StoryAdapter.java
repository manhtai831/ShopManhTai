package com.manhtai.shopmanhtai.adapter.suggestion_today;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manhtai.shopmanhtai.R;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryHolder> {

    Context context;

    public StoryAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public StoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item_story, null);
        StoryHolder holder = new StoryHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull StoryHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    protected class StoryHolder extends RecyclerView.ViewHolder {

        public StoryHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
