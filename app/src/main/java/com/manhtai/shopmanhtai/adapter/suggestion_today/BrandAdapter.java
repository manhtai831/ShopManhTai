package com.manhtai.shopmanhtai.adapter.suggestion_today;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manhtai.shopmanhtai.R;

public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.BrandHolder> {

    Context context;

    public BrandAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public BrandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_brand, null);
        BrandHolder holder = new BrandHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BrandHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 25;
    }

    protected class BrandHolder extends RecyclerView.ViewHolder {

        public BrandHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
