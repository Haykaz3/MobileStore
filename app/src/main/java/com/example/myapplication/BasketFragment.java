package com.example.myapplication;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentBasketBinding;

public class BasketFragment extends Fragment {
    FragmentBasketBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentBasketBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}