package com.example.root.myimgview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by root on 2/17/18.
 */

public class FragmentOne extends Fragment {

    private String title;
    private int image;

    public static FragmentOne newInstance(String title, int resImage) {
        FragmentOne fragment = new FragmentOne();
        Bundle args = new Bundle();
        args.putInt("image", resImage);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        image = getArguments().getInt("image", 0);
        title = getArguments().getString("title");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        TextView tvLabel =  view.findViewById(R.id.txtMain);
        tvLabel.setText(title);

        ImageView imageView = view.findViewById(R.id.imgMain);
        imageView.setImageResource(image);
        return view;
    }
}
