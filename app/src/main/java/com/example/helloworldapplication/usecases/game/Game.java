package com.example.helloworldapplication.usecases.game;

import com.example.helloworldapplication.Button;

import java.util.List;

public interface Game { //TODO: rename GameCore

    interface Listener{



        void onGameOver(); // TODO: Game core manager
        void onDecreaseLifePoint(); // TODO: Game core manager
        void onStagePrepared();
        void onStageSuccess(); // TODO: Game core manager
        void onStageFailed(); //TODO: Game core manager



        void onInputError();
        void onInputSuccess();
    }

    void prepare(List<Button> sequence); // TODO: invoked by Game core manager
    void verifySequenceAt(Button button); //TODO: replace button with template parameter
    //TODO: template parameter i.e. might be int -> hide data type!
}
