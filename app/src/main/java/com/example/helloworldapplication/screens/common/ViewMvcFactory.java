package com.example.helloworldapplication.screens.common;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.example.helloworldapplication.screens.Game.ViewMvcGame;
import com.example.helloworldapplication.screens.Game.ViewMvcGameImpl;

public class ViewMvcFactory {

    private final LayoutInflater mLayoutInflater;

    public ViewMvcFactory(LayoutInflater mLayoutInflater) {
        this.mLayoutInflater = mLayoutInflater;
    }

    public ViewMvcGame getViewMvcGame(@Nullable ViewGroup parent) {
        return new ViewMvcGameImpl(mLayoutInflater, parent, this);
    }
}
