package com.nikhil.rxjavademo.ui.base;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import com.nikhil.rxjavademo.ui.main.MainActivity;

public class BaseFragment extends Fragment {

   private BaseActivity getBaseActivity(){
       return (BaseActivity)(getActivity());
   }

    private boolean isEnableBaseActivity(){
        return getBaseActivity()!=null;
    }


    protected void hideToolbar() {
       if(isEnableBaseActivity()){
           getBaseActivity().hideToolbar();
       }
    }

    protected void showToolbar() {
        if(isEnableBaseActivity()){
            getBaseActivity().showToolbar();
        }
    }

    protected void hideBottomNavigation() {
        if(isEnableBaseActivity()){
            ((MainActivity) getBaseActivity()).hideBottomNavigation();
        }
    }

    protected void showBottomNavigation() {
        if(isEnableBaseActivity()){
            ((MainActivity) getBaseActivity()).showBottomNavigation();
        }
    }

    protected void hideBackButton() {
        if(isEnableBaseActivity()){
            getBaseActivity().hideBackButton();
        }
    }

    protected void showBackButton() {
        if(isEnableBaseActivity()){
            getBaseActivity().showBackButton();
        }
    }

    protected <T extends ViewDataBinding> T  customizeDataBinding(LayoutInflater inflater, ViewGroup container,int layoutId) {
        T binding =
                DataBindingUtil.inflate(inflater, layoutId, container, false);
        binding.setLifecycleOwner(getViewLifecycleOwner());
       return binding;
    }



}
