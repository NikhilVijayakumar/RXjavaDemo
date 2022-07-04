package com.nikhil.rxjavademo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.nikhil.rxjavademo.R;
import com.nikhil.rxjavademo.databinding.FragmentHistoryBinding;
import com.nikhil.rxjavademo.databinding.FragmentHomeBinding;
import com.nikhil.rxjavademo.ui.base.BaseFragment;
import com.nikhil.rxjavademo.ui.splash.SplashViewModel;


public class HomeFragment extends BaseFragment {

    private FragmentHomeBinding binding;
    private HomeViewModel viewModel;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_home);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        showToolbar();
        showBottomNavigation();
        hideBackButton();
        viewModel = new ViewModelProvider(this).get(HomeViewModel.class);
    }
}