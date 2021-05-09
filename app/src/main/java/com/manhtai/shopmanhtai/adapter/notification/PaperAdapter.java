package com.manhtai.shopmanhtai.adapter.notification;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.manhtai.shopmanhtai.fragment_me.child_fragment.BuyFragment;
import com.manhtai.shopmanhtai.fragment_me.child_fragment.WriteFragment;
import com.manhtai.shopmanhtai.fragment_notification.child_fragment.MyNotificationFragment;
import com.manhtai.shopmanhtai.fragment_notification.child_fragment.NotificationNotSignFragment;
import com.manhtai.shopmanhtai.fragment_notification.child_fragment.NotificationSignedFragment;
import com.manhtai.shopmanhtai.fragment_notification.child_fragment.UpdateSellerFragment;

public class PaperAdapter extends FragmentStatePagerAdapter {

    int tabLayout;
    public PaperAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm);
        this.tabLayout = behavior;

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MyNotificationFragment();
            case 1:
                return new UpdateSellerFragment();
            default:
                return new MyNotificationFragment();
        }
    }

    @Override
    public int getCount() {
        return tabLayout;
    }
}
