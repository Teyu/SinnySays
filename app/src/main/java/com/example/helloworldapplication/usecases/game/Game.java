package com.example.helloworldapplication.usecases.game;

import com.example.helloworldapplication.Button;

public interface Game {

    interface Listener{
        void onDisplay(Button button);
        void onGameOver();
        void onDecreaseLifePoint();
    }

    void startAnimation(int numButtons, float delay);
    boolean hasRemainingLifePoints();
    void pressButton(Button button);
    int getLifePoints();
    void setDelay(float delay);
    float getDelay();

}
