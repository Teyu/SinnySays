package com.example.helloworldapplication.screens.Game;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.helloworldapplication.R;
import com.example.helloworldapplication.screens.common.ViewMvcFactory;
import com.example.helloworldapplication.screens.common.mvcviews.BaseObservableViewMvc;

import java.util.ArrayList;

public class ViewMvcGameImpl extends BaseObservableViewMvc<ViewMvcGame.Listener> implements ViewMvcGame{

    public ViewMvcGameImpl(LayoutInflater inflater, ViewGroup parent, ViewMvcFactory viewMvcFactory){
        setRootView(inflater.inflate(R.layout.activity_main, parent, false));
    }

}
