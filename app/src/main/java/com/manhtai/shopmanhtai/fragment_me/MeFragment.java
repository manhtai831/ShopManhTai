package com.manhtai.shopmanhtai.fragment_me;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.manhtai.shopmanhtai.R;
import com.manhtai.shopmanhtai.adapter.me.MeAdapter;
import com.manhtai.shopmanhtai.fragment_me.child_model.ItemChild;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MeFragment extends Fragment {

    private ImageView ivCartFragmentMeNotUser;
    private ImageView ivChatFragmentMeNotUser;
    private CircleImageView ivAvatarFragmentMeNotUser;
    private Button btnSignInFragmentMeNotUser;
    private Button btnSignUpFragmentMeNotUser;
    private RecyclerView rvFragmentMeGr1;
    private RecyclerView rvFragmentMeGr2;
    private RecyclerView rvFragmentMeGr3;
    private RecyclerView rvFragmentMeGr4;



    public MeFragment() {
        // Required empty public constructor
    }

    public static MeFragment newInstance() {
        MeFragment fragment = new MeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_me, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        anhXa(view);
        setItemViewGroup1();
        setItemViewGroup3();
        setItemViewGroup4();


    }

    private void setItemViewGroup1() {
        ArrayList<ItemChild> group = new ArrayList<>();
        group.add(new ItemChild(-1,-1,"????n mua"));
        group.add(new ItemChild(-1,-1,"N???p th??? v?? d???ch v???"));
        MeAdapter meAdapter = new MeAdapter(getContext(),group);
        rvFragmentMeGr1.addItemDecoration(new DividerItemDecoration(rvFragmentMeGr1.getContext(),DividerItemDecoration.VERTICAL));
        rvFragmentMeGr1.setAdapter(meAdapter);
        rvFragmentMeGr1.setNestedScrollingEnabled(false);

    }
    private void setItemViewGroup3() {
        ArrayList<ItemChild> group = new ArrayList<>();
        group.add(new ItemChild(-1,-1,"???? th??ch"));
        group.add(new ItemChild(-1,-1,"???? xem g???n ????y"));
        group.add(new ItemChild(-1,-1,"V?? Shop MT"));
        group.add(new ItemChild(-1,-1,"Shop MT xu"));
        group.add(new ItemChild(-1,-1,"???? xem g???n ????y"));
        group.add(new ItemChild(-1,-1,"????nh gi?? c???a t??i"));
        group.add(new ItemChild(-1,-1,"V?? voucher"));
        MeAdapter meAdapter = new MeAdapter(getContext(),group);
        rvFragmentMeGr3.addItemDecoration(new DividerItemDecoration(rvFragmentMeGr3.getContext(),DividerItemDecoration.VERTICAL));
        rvFragmentMeGr3.setAdapter(meAdapter);
        rvFragmentMeGr3.setNestedScrollingEnabled(false);
    }
    private void setItemViewGroup4() {
        ArrayList<ItemChild> group = new ArrayList<>();
        group.add(new ItemChild(-1,-1,"Thi???t l???p t??i kho???n"));
        group.add(new ItemChild(-1,-1,"Trung t??m tr??? gi??p"));
        group.add(new ItemChild(-1,-1,"Tro chuy???n v???i Shop MT"));
        MeAdapter meAdapter = new MeAdapter(getContext(),group);
        rvFragmentMeGr4.addItemDecoration(new DividerItemDecoration(rvFragmentMeGr4.getContext(),DividerItemDecoration.VERTICAL));
        rvFragmentMeGr4.setAdapter(meAdapter);
        rvFragmentMeGr4.setNestedScrollingEnabled(false);

    }

    private void anhXa(View view) {
        ivCartFragmentMeNotUser = view.findViewById(R.id.iv_cart_fragment_me_not_user);
        ivChatFragmentMeNotUser = view.findViewById(R.id.iv_chat_fragment_me_not_user);
        ivAvatarFragmentMeNotUser = view.findViewById(R.id.iv_avatar_fragment_me_not_user);
        btnSignInFragmentMeNotUser = view.findViewById(R.id.btn_sign_in_fragment_me_not_user);
        btnSignUpFragmentMeNotUser = view.findViewById(R.id.btn_sign_up_fragment_me_not_user);
        rvFragmentMeGr1 = view.findViewById(R.id.lv_fragment_me_gr_1);
        rvFragmentMeGr2 = view.findViewById(R.id.lv_fragment_me_gr_2);
        rvFragmentMeGr3 = view.findViewById(R.id.lv_fragment_me_gr_3);
        rvFragmentMeGr4 = view.findViewById(R.id.lv_fragment_me_gr_4);
    }
}