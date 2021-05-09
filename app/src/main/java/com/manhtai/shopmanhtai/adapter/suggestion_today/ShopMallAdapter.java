package com.manhtai.shopmanhtai.adapter.suggestion_today;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manhtai.shopmanhtai.R;

public class ShopMallAdapter extends RecyclerView.Adapter<ShopMallAdapter.ShopMallHolder> {
    Context context;

    public ShopMallAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ShopMallHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_shop_mall, null);
        ShopMallHolder holder = new ShopMallHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ShopMallHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    protected class ShopMallHolder extends RecyclerView.ViewHolder {
        public ShopMallHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
