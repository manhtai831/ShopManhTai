package com.manhtai.shopmanhtai.adapter.me;

//This class is adapter for views in fragment_me

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manhtai.shopmanhtai.R;
import com.manhtai.shopmanhtai.fragment_me.child_model.ItemChild;

import java.util.ArrayList;

public class MeAdapter extends RecyclerView.Adapter<MeAdapter.MeViewHolder> {

    Context context;
    ArrayList<ItemChild> itemChildren;

    public MeAdapter(Context context, ArrayList<ItemChild> itemChildren) {
        this.context = context;
        this.itemChildren = itemChildren;
    }

    @NonNull
    @Override
    public MeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MeViewHolder(LayoutInflater.from(context).inflate(R.layout.item_me,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MeViewHolder holder, int position) {

        holder.tvItemTitle.setText(itemChildren.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return itemChildren.size();
    }

    public static class MeViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivItemTitle;
        private TextView tvItemTitle;
        private ImageView ivItemNext;

        public MeViewHolder(@NonNull View itemView) {
            super(itemView);
            ivItemTitle = itemView.findViewById(R.id.iv_item_title);
            tvItemTitle = itemView.findViewById(R.id.tv_item_title);
            ivItemNext = itemView.findViewById(R.id.iv_item_next);
        }
    }
}
