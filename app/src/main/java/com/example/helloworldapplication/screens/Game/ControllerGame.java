package com.example.helloworldapplication.screens.Game;

import com.example.helloworldapplication.screens.common.screensnavigator.ScreensNavigator;

public class ControllerGame implements ViewMvcGame.Listener{
    private final ScreensNavigator mScreensNavigator;

    // TODO:
    /*
    * StartButton
    * LeafButton
    * RemainingLivesDisplay
    * */

    //TODO:
    /*
    * GameCore
    * GameCoreManager
    * SequenceAnimationTimer
    * */

    private ViewMvcGame mViewMvcGame;

    public ControllerGame(ScreensNavigator screensNavigator) {
        this.mScreensNavigator = screensNavigator;

        //TODO:
        /*
        * new gamemanager with 3 lives and num stages
        *
        * start button onClick listener
        *   -> SequenceAnimationTimer.timer start
        * */
    }

    void onStart() {
        mViewMvcGame.registerListener(this);
        //TODO:
        /*
        * display num lifes = 3
        * display num buttons all default = 4
        * Mvc.enableStartButton / Mvc.disableButtons
        * */
    }

    //TODO:

    /*
    * GameManager.onGameOver()             -> Mvc.displayGameOver / goToNextScreen
    */

    /*
    * GameManager.onStageFailed()         -> display stage failed
    *                               -> Mvc.enableStartButton / Mvc.disableButtons
    *                               -> gameManager.proceedOnFailure
    */

    /*
    * Game.onDecreaseLifepoint      -> Mvc.setLifePoint - 1
    */

    /*
    * GameManager.onStagePrepared       -> SequenceAnimationTimer.start() -> start animation
    * */

    /*
    * SequenceAnimationTimer.onStart()                -> Mvc.disableAllButtons
    */

    /*
    * SequenceAnimationTimer.onFinished()            -> Mvc.enableButtons / Mvc.disableStartButton
    */

    /*
    * SequenceAnimationTimer.onTick                  -> animate sequence current sequence element
    */

    /* Mvc.buttonPressed             -> GameManager.Game.verifySequenceAt current element
    */

    /* Game.onInputError                  -> Mvc.displayError of current element
    */

    /*
    Game.onInputSuccess             -> Mvc.displaySuccess of current element
    */

     /*/
    * GameManager.onStageSuccess              -> display stage success
    *                                           -> Mvc.enableStartButton / Mvc.disableButtons //TODO: redundant
      *                                         -> gameManager.proceedOnSuccess
    * */

    void onStop() {
        mViewMvcGame.unregisterListener(this);
    }

    void bindView (ViewMvcGame viewMvcGame) {
        mViewMvcGame = viewMvcGame;
    }
}
