package com.manhtai.shopmanhtai.adapter.suggestion_today;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manhtai.shopmanhtai.R;

public class SuggestTodayAdapter extends RecyclerView.Adapter<SuggestTodayAdapter.SuggestTodayHolder> {

    Context context;

    public SuggestTodayAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public SuggestTodayHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_suggest_today, parent,false);
        return new SuggestTodayHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SuggestTodayHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class SuggestTodayHolder extends RecyclerView.ViewHolder {

        public SuggestTodayHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
