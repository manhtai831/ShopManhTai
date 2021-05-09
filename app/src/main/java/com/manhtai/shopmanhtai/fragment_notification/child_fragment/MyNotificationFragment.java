package com.manhtai.shopmanhtai.fragment_notification.child_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.manhtai.shopmanhtai.R;
import com.manhtai.shopmanhtai.fragment_notification.child_model.Notification1;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyNotificationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyNotificationFragment extends Fragment {

    private RecyclerView rvMyNotification1;
    private TextView textView17;
    private TextView tvMyNotificationReadAll;
    private RecyclerView rvMyNotification2;


    public MyNotificationFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static MyNotificationFragment newInstance() {
        MyNotificationFragment fragment = new MyNotificationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_notification, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvMyNotification1 = view.findViewById(R.id.rv_my_notification_1);
        textView17 = view.findViewById(R.id.textView17);
        tvMyNotificationReadAll = view.findViewById(R.id.tv_my_notification_read_all);
        rvMyNotification2 = view.findViewById(R.id.rv_my_notification_2);

        setRecyclerView1();
        setRecyclerView2();
    }

    private void setRecyclerView1() {
        ArrayList<Notification1> notification1s = new ArrayList<>();
        notification1s.add(new Notification1(-1, "Khuyến mãi", "Content short"));
        notification1s.add(new Notification1(-1, "Shop Live % Feed", "Content short"));
        notification1s.add(new Notification1(-1, "Hoạt động", "Content short"));
        notification1s.add(new Notification1(-1, "Cập nhật Shop MT", "Content short"));
        notification1s.add(new Notification1(-1, "Shop MT Game", "Content short"));
        RecyclerView1Adapter recyclerView1Adapter = new RecyclerView1Adapter(notification1s);
        rvMyNotification1.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        rvMyNotification1.setAdapter(recyclerView1Adapter);
        rvMyNotification1.setNestedScrollingEnabled(false);
    }

    private void setRecyclerView2() {
        ArrayList<Notification1> notification1s = new ArrayList<>();
        notification1s.add(new Notification1(-1, "Khuyến mãi", "Content short"));
        notification1s.add(new Notification1(-1, "Shop Live % Feed", "Content short"));
        notification1s.add(new Notification1(-1, "Hoạt động", "Content short"));
        notification1s.add(new Notification1(-1, "Cập nhật Shop MT", "Content short"));
        notification1s.add(new Notification1(-1, "Shop MT Game", "Content short"));
        RecyclerView1Adapter recyclerView1Adapter = new RecyclerView1Adapter(notification1s);
        rvMyNotification2.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        rvMyNotification2.setAdapter(recyclerView1Adapter);
        rvMyNotification2.setNestedScrollingEnabled(false);
    }

    private class RecyclerView1Adapter extends RecyclerView.Adapter<RecyclerView1Adapter.RecyclerView1Holder> {

        ArrayList<Notification1> notification1s;

        public RecyclerView1Adapter(ArrayList<Notification1> notification1s) {
            this.notification1s = notification1s;
        }

        @NonNull
        @Override
        public RecyclerView1Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new RecyclerView1Holder(LayoutInflater.from(getContext()).inflate(R.layout.item_notification_1, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView1Holder holder, int position) {
            holder.tvItemNotification1Title.setText(notification1s.get(position).getTitle());
            holder.tvItemNotification1ContentShort.setText(notification1s.get(position).getContentShort());
        }

        @Override
        public int getItemCount() {
            return notification1s.size();
        }

        private class RecyclerView1Holder extends RecyclerView.ViewHolder {
            private ImageView ivItemNotification1Title;
            private TextView tvItemNotification1Title;
            private TextView tvItemNotification1ContentShort;

            public RecyclerView1Holder(@NonNull View itemView) {
                super(itemView);
                ivItemNotification1Title = itemView.findViewById(R.id.iv_item_notification_1_title);
                tvItemNotification1Title = itemView.findViewById(R.id.tv_item_notification_1_title);
                tvItemNotification1ContentShort = itemView.findViewById(R.id.tv_item_notification_1_content_short);
            }
        }
    }
}