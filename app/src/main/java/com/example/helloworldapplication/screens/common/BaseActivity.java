/*
 * Copyright 2020, Julia Michaely, All rights reserved.
 */

package com.example.helloworldapplication.screens.common;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworldapplication.common.CustomApplication;
import com.example.helloworldapplication.common.dependencyinjection.ControllerCompositionRoot;

public class BaseActivity extends AppCompatActivity {

    private ControllerCompositionRoot mCompositionRoot;

    protected ControllerCompositionRoot getCompositionRoot() {
        if (mCompositionRoot == null) {
            mCompositionRoot = new ControllerCompositionRoot(((CustomApplication) getApplication()).getCompositionRoot(), this);
        }

        return mCompositionRoot;
    }
}
