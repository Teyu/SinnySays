/*
 * Copyright 2020, Julia Michaely, All rights reserved.
 */

package com.example.helloworldapplication.screens.common;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BaseObservable<ListenerType> {

    private final Set<ListenerType> mListeners = new HashSet<>();

    public void registerListener(ListenerType listener) {
        mListeners.add(listener);
    }

    public void unregisterListener(ListenerType listener) {
        mListeners.remove(listener);
    }

    protected Set<ListenerType> getListeners(){
        return Collections.unmodifiableSet(mListeners);
    }
}
