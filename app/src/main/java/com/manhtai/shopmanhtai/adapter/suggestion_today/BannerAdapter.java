package com.manhtai.shopmanhtai.adapter.suggestion_today;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.manhtai.shopmanhtai.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BannerAdapter extends PagerAdapter {

    private static final String TAG = "AAA";
    Context context;
    ArrayList<String> uris;

    public BannerAdapter(Context context, ArrayList<String> uris) {
        this.context = context;
        this.uris = uris;
    }

    @Override
    public int getCount() {
        return uris.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout)object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_banner, null);
        ImageView imageView = itemView.findViewById(R.id.iv_banner);
        Picasso.with(context).load(uris.get(position)).into(imageView);
        //Glide.with(context).load(uris.get(position)).into(imageView);
        Log.d(TAG, "instantiateItem: " + position);

        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(((LinearLayout)object));
    }
}
