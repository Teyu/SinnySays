/*
 * Copyright 2020, Julia Michaely, All rights reserved.
 */

package com.example.helloworldapplication.screens.common.mvcviews;

public interface ObservableViewMvc<ListenerType> extends ViewMvc {

    void registerListener(ListenerType listener);

    void unregisterListener(ListenerType listener);
}
