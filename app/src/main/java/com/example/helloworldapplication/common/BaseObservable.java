package com.example.helloworldapplication.common;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BaseObservable<ListenerType> {

    private Set<ListenerType> mListeners = new HashSet<>();

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
