package com.nikhil.rxjavademo.ui.base;

import static androidx.navigation.ui.NavigationUI.setupActionBarWithNavController;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.nikhil.rxjavademo.R;
import com.nikhil.rxjavademo.databinding.ActivityBaseBinding;

public class BaseActivity extends AppCompatActivity {

    protected ActivityBaseBinding binding;

    protected void customizeDataBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_base);
        binding.setLifecycleOwner(this);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        setupActionBarWithNavController(this, navController);
        NavigationUI.setupWithNavController(binding.bottomNavigation, navHostFragment.getNavController());
    }

    public void hideToolbar() {
        getSupportActionBar().hide();
    }

    public void showToolbar() {
        getSupportActionBar().show();
    }


    public void hideBackButton() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setHomeButtonEnabled(false);
        }
    }

    public void showBackButton() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
    }
}
