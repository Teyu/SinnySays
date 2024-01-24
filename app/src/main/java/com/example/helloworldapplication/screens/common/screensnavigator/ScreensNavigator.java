/*
 * Copyright 2020, Julia Michaely, All rights reserved.
 */

package com.example.helloworldapplication.screens.common.screensnavigator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class ScreensNavigator {

    private final Context mContext;

    public ScreensNavigator(Context context) {
        this.mContext = context;
    }

    /*public void toActivityQuestion(@Nullable Bundle bundle) {
        Intent intent = new Intent(mContext, ActivityQuestion.class);
        mContext.startActivity (intent, bundle);
    }*/
}
