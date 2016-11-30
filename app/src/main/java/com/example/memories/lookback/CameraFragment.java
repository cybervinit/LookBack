package com.example.memories.lookback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * CameraFragment: This is the fragment that represents the camera screen in the list of
 *                      fragments.
 */
public class CameraFragment extends android.support.v4.app.Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);

        return view;
    }

    /**
     * newInstance: To create a new instance of this CameraFragment.
     * @return: returns the new intance of the fragment.
     */
    public static CameraFragment newInstance() {
        
        Bundle args = new Bundle();

        CameraFragment fragment = new CameraFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
