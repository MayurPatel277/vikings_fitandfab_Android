package com.example.vikings_fitandfab_android.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import com.example.vikings_fitandfab_android.DietPlanActivity;
import com.example.vikings_fitandfab_android.R;
import com.example.vikings_fitandfab_android.databinding.FragmentHomeBinding;
import com.example.vikings_fitandfab_android.databinding.FragmentWorkoutBinding;


public class HomeFragment extends Fragment {


    FragmentHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }
}