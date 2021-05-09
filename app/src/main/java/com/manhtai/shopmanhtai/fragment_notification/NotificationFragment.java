package com.manhtai.shopmanhtai.fragment_notification;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.manhtai.shopmanhtai.R;
import com.manhtai.shopmanhtai.fragment_notification.child_fragment.NotificationNotSignFragment;
import com.manhtai.shopmanhtai.fragment_notification.child_fragment.NotificationSignedFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NotificationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NotificationFragment extends Fragment {
    private Toolbar tbFmNotofication;





    public NotificationFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static NotificationFragment newInstance() {
        NotificationFragment fragment = new NotificationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tbFmNotofication = view.findViewById(R.id.tb_fm_notofication);

        ((AppCompatActivity) getActivity()).setSupportActionBar(tbFmNotofication);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Thông báo");



        //If have userName, inflat layout signed, else inflat layout not signed
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fl_fm_notification, new NotificationSignedFragment()).commit();
    }
}