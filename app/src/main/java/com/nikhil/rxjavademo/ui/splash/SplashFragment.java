package com.nikhil.rxjavademo.ui.splash;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.nikhil.rxjavademo.R;
import com.nikhil.rxjavademo.databinding.FragmentSplashBinding;
import com.nikhil.rxjavademo.ui.base.BaseFragment;


public class SplashFragment extends BaseFragment {

    private FragmentSplashBinding binding;
    private  SplashViewModel viewModel;
    public SplashFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_splash);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        hideToolbar();
        hideBottomNavigation();
        viewModel = new ViewModelProvider(this).get(SplashViewModel.class);
        gotoHome(view);


    }

    private void gotoHome(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_homeFragment);
            }
        }, 3000);
    }
}