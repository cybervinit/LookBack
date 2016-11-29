package com.example.memories.lookback;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;


public class MemoryFragment extends android.support.v4.app.Fragment {

    protected Activity mActivity;
    private TextView textPlaceHolder;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = getActivity();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.memory_fragment_layout, container, false);
        textPlaceHolder = (TextView) view.findViewById(R.id.text_view_placeholder);
        textPlaceHolder.setText("This is working");
        Toast.makeText(getContext(),"MemoryFragment Created", Toast.LENGTH_SHORT).show();

        return view;
    }

    public static MemoryFragment newInstance() {
        
        Bundle args = new Bundle();
        
        MemoryFragment fragment = new MemoryFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
