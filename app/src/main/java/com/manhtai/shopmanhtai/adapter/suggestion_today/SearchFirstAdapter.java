package com.manhtai.shopmanhtai.adapter.suggestion_today;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manhtai.shopmanhtai.R;

public class SearchFirstAdapter extends RecyclerView.Adapter<SearchFirstAdapter.SearchFirstHolder> {

    Context context;

    public SearchFirstAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public SearchFirstHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_search_first, null);
        SearchFirstHolder holder = new SearchFirstHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SearchFirstHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    protected class SearchFirstHolder extends RecyclerView.ViewHolder{

        public SearchFirstHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
