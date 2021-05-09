package com.manhtai.shopmanhtai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShopLiveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShopLiveFragment extends Fragment {


    public ShopLiveFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ShopLiveFragment newInstance() {
        ShopLiveFragment fragment = new ShopLiveFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop_live, container, false);
    }
}