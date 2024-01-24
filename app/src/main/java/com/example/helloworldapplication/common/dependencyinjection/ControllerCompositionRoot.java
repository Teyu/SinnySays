package com.example.helloworldapplication.common.dependencyinjection;

import android.content.Context;
import android.view.LayoutInflater;

import androidx.fragment.app.FragmentActivity;

import com.example.helloworldapplication.screens.Game.ControllerGame;
import com.example.helloworldapplication.screens.common.ViewMvcFactory;
import com.example.helloworldapplication.screens.common.screensnavigator.ScreensNavigator;

public class ControllerCompositionRoot {

    //private final CompositionRoot mCompositionRoot;
    private final FragmentActivity mActivity;

    public ControllerCompositionRoot(CompositionRoot mCompositionRoot, FragmentActivity mActivity) {
        //this.mCompositionRoot = mCompositionRoot;
        this.mActivity = mActivity;
    }

    /** ------------------------------------- common ------------------------------------- **/

    private LayoutInflater getLayoutInflater() {
        return LayoutInflater.from(getActivity());
    }

    private Context getContext() {
        return getActivity();
    }

    private FragmentActivity getActivity() {
        return mActivity;
    }

    public ViewMvcFactory getViewMvcFactory() {
        return new ViewMvcFactory(getLayoutInflater());
    }

    /** ------------------------------------- controllers ------------------------------------- **/

    public ScreensNavigator getScreensNavigator() {
        return new ScreensNavigator(getContext());
    }

    public ControllerGame getControllerGame(ScreensNavigator screensNavigator) {
        return new ControllerGame(screensNavigator);
    }
}
