package com.manhtai.shopmanhtai;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.manhtai.shopmanhtai.fragment_me.MeFragment;
import com.manhtai.shopmanhtai.fragment_notification.NotificationFragment;
import com.manhtai.shopmanhtai.fragment_suggestion_today.SuggestionTodayFragment;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "AAA";
    private FrameLayout frameLayout;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new SuggestionTodayFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.suggestion_today:
                        fragment = SuggestionTodayFragment.newInstance();
                        break;
                    case R.id.shop_feed:
                        fragment = ShopFeedFragment.newInstance();
                        break;
                    case R.id.shop_live:
                        fragment = ShopLiveFragment.newInstance();
                        break;
                    case R.id.shop_notification:
                        fragment = NotificationFragment.newInstance();
                        break;
                    case R.id.shop_me:
                        fragment = MeFragment.newInstance();
                        break;
                    default:
                        fragment = SuggestionTodayFragment.newInstance();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment).commit();
                return true;
            }
        });
    }

}