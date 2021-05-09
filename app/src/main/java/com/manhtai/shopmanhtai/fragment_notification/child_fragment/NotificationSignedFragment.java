package com.manhtai.shopmanhtai.fragment_notification.child_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.manhtai.shopmanhtai.R;
import com.manhtai.shopmanhtai.adapter.notification.PaperAdapter;

public class NotificationSignedFragment extends Fragment {
    private TabLayout tlFmNotofication;
    private ViewPager vpFmNotification;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fm_notification_signed, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tlFmNotofication = view.findViewById(R.id.tl_fm_notofication);
        vpFmNotification = view.findViewById(R.id.vp_fm_notification);

        tlFmNotofication.addTab(tlFmNotofication.newTab().setText("Thông báo của tôi"));
        tlFmNotofication.addTab(tlFmNotofication.newTab().setText("Cập nhật người bán"));
        tlFmNotofication.setTabGravity(TabLayout.GRAVITY_CENTER);
        PaperAdapter paperAdapter = new PaperAdapter(getActivity().getSupportFragmentManager(), tlFmNotofication.getTabCount());
        vpFmNotification.setAdapter(paperAdapter);
        vpFmNotification.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tlFmNotofication));
        tlFmNotofication.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vpFmNotification.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
