package com.gadgetsaint.viewpagerexample.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gadgetsaint.viewpagerexample.R;
import com.gadgetsaint.viewpagerexample.databinding.FragmentOneBinding;

/**
 * Created by Anu on 22/04/17.
 */



public class FragmentOne extends Fragment {

    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentOneBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_one,container,false);
        return binding.getRoot();
    }

}