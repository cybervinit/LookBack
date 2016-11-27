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

import static android.R.attr.onClick;

/**
 * Created by Vinit Soni on 2016-11-27.
 */

public class MemoryFragment extends android.support.v4.app.Fragment implements View.OnClickListener {

    protected Activity mActivity;
    private TextView textPlaceHolder;

    @Override
    public void onClick(View v) {
        // the action for the button
    }

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

        return view;
    }


}
