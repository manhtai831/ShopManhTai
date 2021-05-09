package com.manhtai.shopmanhtai.adapter.suggestion_today;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manhtai.shopmanhtai.R;

public class ProductSuggestTodayAdapter extends RecyclerView.Adapter<ProductSuggestTodayAdapter.ProductSuggestTodayHolder> {

    Context context;

    public ProductSuggestTodayAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ProductSuggestTodayHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_product_sugest_today, parent,false);
        return new ProductSuggestTodayHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductSuggestTodayHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public static class ProductSuggestTodayHolder extends RecyclerView.ViewHolder {

        public ProductSuggestTodayHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
