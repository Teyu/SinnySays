package com.example.helloworldapplication.usecases.timer;

public interface Timer {

    interface Listener {
        void onStart();
        void onTick();
        void onFinish();
    }

    void start(float delay, int numTicks);
}

//TODO: unit test

/*
    // start -> has listener notified
    // start -> no listener not notified
    // start -> has listener notify on tick
    // start -> no listeners not notified
    // start -> notify next tick with delay
    // start -> has listener on finish notify
    // start -> no listener not notified
    // start -> num ticks equals on tick invocations

    */
