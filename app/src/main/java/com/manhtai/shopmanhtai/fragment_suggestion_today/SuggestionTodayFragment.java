package com.manhtai.shopmanhtai.fragment_suggestion_today;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.manhtai.shopmanhtai.adapter.suggestion_today.BannerAdapter;
import com.manhtai.shopmanhtai.adapter.suggestion_today.BrandAdapter;
import com.manhtai.shopmanhtai.adapter.suggestion_today.FlashSaleAdapter;
import com.manhtai.shopmanhtai.adapter.suggestion_today.ProductSuggestTodayAdapter;
import com.manhtai.shopmanhtai.adapter.suggestion_today.SearchFirstAdapter;
import com.manhtai.shopmanhtai.adapter.suggestion_today.ServiceAdapter;
import com.manhtai.shopmanhtai.adapter.suggestion_today.ShopMallAdapter;
import com.manhtai.shopmanhtai.adapter.suggestion_today.StoryAdapter;
import com.manhtai.shopmanhtai.adapter.suggestion_today.SuggestTodayAdapter;
import com.manhtai.shopmanhtai.R;
import com.manhtai.shopmanhtai.fragment_suggestion_today.chid_activities.SearchItemActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SuggestionTodayFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SuggestionTodayFragment extends Fragment {
    private static final String TAG = "AAA";
    private AppBarLayout appbarLayout;
    private NestedScrollView nestedScrollView;
    private SearchView searchView;
    private ImageView ivCart;
    private ImageView ivChat;
    private ViewPager viewPaper;
    private BannerAdapter bannerAdapter;
    private RecyclerView recycleViewFlashSale;
    private FlashSaleAdapter flashSaleAdapter;
    private RecyclerView recycleViewFirstSearch;
    private SearchFirstAdapter searchFirstAdapter;
    private RecyclerView recycleViewStory;
    private StoryAdapter storyAdapter;
    private ImageView ivProductBack;
    private ImageView ivChinhHang;
    private ImageView ivGiaoHang;
    private RecyclerView recycleViewShopMall;
    private DatabaseReference databaseReference;
    private ShopMallAdapter shopMallAdapter;
    private RecyclerView recycleViewBrand;
    private BrandAdapter brandAdapter;
    private ServiceAdapter serviceAdapter;
    private RecyclerView recycleViewLoadTagService;
    private RecyclerView recycleViewSuggestToday;
    private SuggestTodayAdapter suggestTodayAdapter;
    private RecyclerView recycleViewProductSuggestToday;
    private ProductSuggestTodayAdapter productSuggestTodayAdapter;
    private RecyclerView recycleViewSuggestTodayTop;
    private CardView cvSuggestionToday;
    private CardView cvSuggestionToday1;
    private CardView cvSuggestionToday2;
    private CardView cvSuggestionToday3;
    private CardView cvSuggestionToday4;
    private CardView cvSuggestionToday5;
    private CardView cvSuggestionToday6;
    private CardView cvSuggestionToday7;
    private HorizontalScrollView hsvSuggestionToday;

    Runnable runnable;
    Handler handler;
    private int TIME_HANDLER;

    private void AnhXa(View view) {
        searchView = (SearchView) view.findViewById(R.id.search_view);
        appbarLayout = (AppBarLayout) view.findViewById(R.id.appbar_layout);
        nestedScrollView = (NestedScrollView) view.findViewById(R.id.nested_scroll_view);
        viewPaper = (ViewPager) view.findViewById(R.id.view_paper);
        ivCart = (ImageView) view.findViewById(R.id.iv_cart);
        ivChat = (ImageView) view.findViewById(R.id.iv_chat);
        recycleViewFlashSale = (RecyclerView) view.findViewById(R.id.recycle_view_flash_sale);
        recycleViewFirstSearch = view.findViewById(R.id.recycle_view_first_search);
        recycleViewStory = view.findViewById(R.id.recycle_view_story);
        ivProductBack = view.findViewById(R.id.iv_product_back);
        ivChinhHang = view.findViewById(R.id.iv_chinh_hang);
        ivGiaoHang = view.findViewById(R.id.iv_giao_hang);
        recycleViewShopMall = view.findViewById(R.id.recycle_view_shop_mall);
        recycleViewBrand = view.findViewById(R.id.recycle_view_brand);
        recycleViewLoadTagService = view.findViewById(R.id.recycle_view_load_tag_service);
        recycleViewSuggestToday = view.findViewById(R.id.recycle_view_suggest_today);
        recycleViewProductSuggestToday = view.findViewById(R.id.recycle_view_product_suggest_today);
        recycleViewSuggestTodayTop = view.findViewById(R.id.recycle_view_suggest_today_top);
        cvSuggestionToday = view.findViewById(R.id.cv_suggestion_today);
        cvSuggestionToday1 = view.findViewById(R.id.cv_suggestion_today_1);
        cvSuggestionToday2 = view.findViewById(R.id.cv_suggestion_today_2);
        cvSuggestionToday3 = view.findViewById(R.id.cv_suggestion_today_3);
        cvSuggestionToday4 = view.findViewById(R.id.cv_suggestion_today_4);
        cvSuggestionToday5 = view.findViewById(R.id.cv_suggestion_today_5);
        cvSuggestionToday6 = view.findViewById(R.id.cv_suggestion_today_6);
        cvSuggestionToday7 = view.findViewById(R.id.cv_suggestion_today_7);
        hsvSuggestionToday = view.findViewById(R.id.hsv_suggestion_today);
    }

    public static SuggestionTodayFragment newInstance() {
        SuggestionTodayFragment fragment = new SuggestionTodayFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_suggestion_today, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AnhXa(view);
        nestedScrollViewChange();
        getDatabaseReference();
        setFlashSaleRecyclerview();
        setFirstSearchRecyclerview();
        setStoryRecyclerview();
        setImageBitmapStory();
        setShopMallRecyclerView();
        setBrandRecyclerView();
        setServiceRecyclerView();
        setSuggestTodayRecyclerView();
        setProductSuggestTodayRecyclerView();
        setProductSuggestTodayRecyclerViewTop();

    }

    private void setProductSuggestTodayRecyclerViewTop() {
        suggestTodayAdapter = new SuggestTodayAdapter(getActivity());
        recycleViewSuggestTodayTop.setAdapter(suggestTodayAdapter);
    }

    private void setProductSuggestTodayRecyclerView() {
        productSuggestTodayAdapter = new ProductSuggestTodayAdapter(getActivity());
        recycleViewProductSuggestToday.setAdapter(productSuggestTodayAdapter);
    }

    private void setSuggestTodayRecyclerView() {
        suggestTodayAdapter = new SuggestTodayAdapter(getActivity());
        recycleViewSuggestToday.setAdapter(suggestTodayAdapter);
    }

    private void setServiceRecyclerView() {
        serviceAdapter = new ServiceAdapter(getActivity());
        recycleViewLoadTagService.setAdapter(serviceAdapter);
    }

    private void setBrandRecyclerView() {
        brandAdapter = new BrandAdapter(getActivity());
        recycleViewBrand.setAdapter(brandAdapter);
    }

    private void setShopMallRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);

        shopMallAdapter = new ShopMallAdapter(getActivity());
        recycleViewShopMall.setLayoutManager(linearLayoutManager);
        recycleViewShopMall.setAdapter(shopMallAdapter);
    }

    private void setImageBitmapStory() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_shop_mall);
        Bitmap rzBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        ivProductBack.setImageBitmap(rzBitmap);
        Bitmap rzBitmap1 = Bitmap.createBitmap(bitmap, bitmap.getWidth() / 2, 0, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        ivChinhHang.setImageBitmap(rzBitmap1);
        Bitmap rzBitmap2 = Bitmap.createBitmap(bitmap, 0, bitmap.getHeight() / 2, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        ivGiaoHang.setImageBitmap(rzBitmap2);
    }

    private void setStoryRecyclerview() {
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getActivity());
        linearLayoutManager2.setOrientation(RecyclerView.HORIZONTAL);
        storyAdapter = new StoryAdapter(getActivity());
        recycleViewStory.setLayoutManager(linearLayoutManager2);
        recycleViewStory.setAdapter(storyAdapter);
    }

    private void setFirstSearchRecyclerview() {
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getActivity());
        linearLayoutManager1.setOrientation(RecyclerView.HORIZONTAL);
        searchFirstAdapter = new SearchFirstAdapter(getActivity());
        recycleViewFirstSearch.setLayoutManager(linearLayoutManager1);
        recycleViewFirstSearch.setAdapter(searchFirstAdapter);
    }

    private void setFlashSaleRecyclerview() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        flashSaleAdapter = new FlashSaleAdapter(getActivity());
        recycleViewFlashSale.setLayoutManager(linearLayoutManager);
        recycleViewFlashSale.setAdapter(flashSaleAdapter);
    }

    private void getDatabaseReference() {
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), SearchItemActivity.class));
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            appbarLayout.setOutlineProvider(null);
        }
        ArrayList<String> uris = new ArrayList<>();
        bannerAdapter = new BannerAdapter(getContext(), uris);
        viewPaper.setAdapter(bannerAdapter);
        databaseReference = FirebaseDatabase.getInstance().getReference();
        databaseReference.child("banner").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Log.d(TAG, "onChildAdded: " + snapshot.getValue(String.class).toString());
                uris.add(snapshot.getValue(String.class));
                Log.d(TAG, "onChildAdded: " + uris.size());
                bannerAdapter.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {
            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
        autoSliderBanner();

    }


    private void autoSliderBanner() {
        TIME_HANDLER = 7000;
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                int pos = viewPaper.getCurrentItem();
                pos++;
                if (pos >= bannerAdapter.getCount()) pos = 0;
                viewPaper.setCurrentItem(pos);
                handler.postDelayed(runnable, TIME_HANDLER);
            }
        };
        handler.postDelayed(runnable, TIME_HANDLER);

    }

    private void nestedScrollViewChange() {
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                Log.d(TAG, "onScrollChange: " + scrollY);
                if (scrollY > 50) {
                    appbarLayout.setBackgroundColor(Color.parseColor("#C032D8"));

                    searchView.setBackgroundColor(Color.parseColor("#FFE1E1E1"));
                    ivCart.setColorFilter(Color.WHITE);
                    ivChat.setColorFilter(Color.WHITE);
                } else {
                    appbarLayout.setBackgroundColor(Color.TRANSPARENT);
                    searchView.setBackgroundColor(Color.WHITE);
                    ivCart.setColorFilter(getResources().getColor(R.color.white));
                    ivChat.setColorFilter(getResources().getColor(R.color.white));

                }
                Log.d(TAG, "onScrollChange: nest" + nestedScrollView.getChildAt(0).getHeight());
                Log.d(TAG, "onScrollChange: 10nest" + nestedScrollView.getMeasureAllChildren());
                Log.d(TAG, "onScrollChange: 0nest" + cvSuggestionToday.getHeight());
                Log.d(TAG, "onScrollChange: 1nest" + cvSuggestionToday1.getHeight());
                Log.d(TAG, "onScrollChange: 2nest" + cvSuggestionToday2.getHeight());
                Log.d(TAG, "onScrollChange: 3nest" + cvSuggestionToday3.getHeight());
                Log.d(TAG, "onScrollChange: 4nest" + cvSuggestionToday4.getHeight());
                Log.d(TAG, "onScrollChange: 5nest" + cvSuggestionToday5.getHeight());
                Log.d(TAG, "onScrollChange: 6nest" + cvSuggestionToday6.getHeight());
                Log.d(TAG, "onScrollChange: 7nest" + cvSuggestionToday7.getHeight());
                Log.d(TAG, "onScrollChange: 8nest" + recycleViewProductSuggestToday.getHeight());
                Log.d(TAG, "onScrollChange: 9nest" + hsvSuggestionToday.getHeight());
                Log.d(TAG, "onScrollChange: 11nest" + viewPaper.getHeight());

                int height = nestedScrollView.getChildAt(0).getHeight() -
                        recycleViewProductSuggestToday.getHeight() - 112 - cvSuggestionToday7.getHeight();
//                        (cvSuggestionToday.getHeight() +
//                                cvSuggestionToday1.getHeight() +
//                                cvSuggestionToday2.getHeight() +
//                                cvSuggestionToday3.getHeight() +
//                                cvSuggestionToday4.getHeight() +
//                                cvSuggestionToday5.getHeight() +
//                                cvSuggestionToday6.getHeight() +
//                                cvSuggestionToday7.getHeight() +
//                                hsvSuggestionToday.getHeight() +
//                                viewPaper.getHeight());


                if(scrollY >= height){

                    recycleViewSuggestTodayTop.setVisibility(View.VISIBLE);
                }else{
                    recycleViewSuggestTodayTop.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    @Override
    public void onDestroy() {
        if (runnable != null) handler.removeCallbacks(runnable);
        super.onDestroy();
    }
}