package com.example.helloworldapplication.usecases.game;

import com.example.helloworldapplication.Button;
import com.example.helloworldapplication.Randomizer;
import com.example.helloworldapplication.common.BaseObservable;

import java.util.ArrayList;

public class GameImpl extends BaseObservable<Game.Listener> implements Game{

    private float mDisplayButtonDelay = 0.0f;
    private Randomizer mRandomizer = new Randomizer();
    private ArrayList<Button> mButtons = new ArrayList<>();

    @Override
    public void startAnimation(int numButtons, float delay) {

    }

    @Override
    public boolean hasRemainingLifePoints() {
        return false;
    }

    @Override
    public void pressButton(Button button) {

    }

    @Override
    public int getLifePoints() {
        return 0;
    }

    @Override
    public void setDelay(float delay) {

    }

    @Override
    public float getDelay() {
        return 0;
    }

    private void notifyDisplayButtonPress(Button button) {
        //iterate through listeners and invoke onDisplayButtonPress
    }

    private void notifyDecreaseLifePoints(){

    }

    private void decreaseLifePoints() {}

    private void finish() {}

    private void gameOver() {}

}
