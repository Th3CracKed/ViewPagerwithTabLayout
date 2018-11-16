package com.gadgetsaint.viewpagerexample.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gadgetsaint.viewpagerexample.R;
import com.gadgetsaint.viewpagerexample.databinding.FragmentTwoBinding;

/**
 * Created by Anu on 22/04/17.
 */



public class FragmentTwo extends Fragment {

    public FragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentTwoBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_two,container,false);
        return binding.getRoot();
    }

}