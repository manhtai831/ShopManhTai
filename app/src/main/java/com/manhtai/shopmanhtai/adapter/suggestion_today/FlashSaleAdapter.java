package com.manhtai.shopmanhtai.adapter.suggestion_today;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manhtai.shopmanhtai.R;

public class FlashSaleAdapter extends RecyclerView.Adapter<FlashSaleAdapter.FlashSaleHolder> {

    Context context;

    public FlashSaleAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public FlashSaleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_flash_sale, null);
        FlashSaleHolder holder = new FlashSaleHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FlashSaleHolder holder, int position) {
        if (position == 15){
            //set thanh anh xem tat ca
        }

    }

    @Override
    public int getItemCount() {
        return 16;
    }

    protected class FlashSaleHolder extends RecyclerView.ViewHolder{
        private ImageView ivProduct;
        private ImageView ivPercentSale;
        private ImageView ivBrandShop;
        private TextView tvPrice;
        private SeekBar sbProductExist;



        public FlashSaleHolder(@NonNull View itemView) {
            super(itemView);
            ivProduct = (ImageView) itemView.findViewById(R.id.iv_product);
            ivPercentSale = (ImageView) itemView.findViewById(R.id.iv_percent_sale);
            ivBrandShop = (ImageView) itemView.findViewById(R.id.iv_brand_shop);
            tvPrice = (TextView) itemView.findViewById(R.id.tv_price);
            sbProductExist = (SeekBar) itemView.findViewById(R.id.sb_product_exist);
        }
    }
}
