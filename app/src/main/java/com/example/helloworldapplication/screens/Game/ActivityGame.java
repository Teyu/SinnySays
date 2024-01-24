package com.example.helloworldapplication.screens.Game;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.helloworldapplication.R;
import com.example.helloworldapplication.screens.common.BaseActivity;

import java.util.Objects;

public class ActivityGame extends BaseActivity {

    private ControllerGame mControllerGame;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_main);

        ViewMvcGame viewMvcGame = getCompositionRoot().getViewMvcFactory().getViewMvcGame(null);

        try {
            mControllerGame = getCompositionRoot().getControllerGame(
                    getCompositionRoot().getScreensNavigator()
            );
        } catch (Exception e) {
            Log.i("ERROR", Objects.requireNonNull(e.getMessage()));
        }

        mControllerGame.bindView(viewMvcGame);
        setContentView(viewMvcGame.getRootView());
    }
}
