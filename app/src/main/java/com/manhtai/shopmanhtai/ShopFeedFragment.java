package com.manhtai.shopmanhtai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShopFeedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShopFeedFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match

    public ShopFeedFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ShopFeedFragment newInstance() {
        ShopFeedFragment fragment = new ShopFeedFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop_feed, container, false);
    }
}