package com.example.helloworldapplication.usecases.game;

import com.example.helloworldapplication.Button;
import com.example.helloworldapplication.Randomizer;

import junit.framework.TestCase;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameTest extends TestCase {

    @Mock private Button mButtonMock;

    private GameImpl SUT;

    @Before
    public void setUp() {
        //super.setUp();

        SUT = new GameImpl();
    }

    @After
    public void tearDown() {
    }

    // constructor -> num lives set
    // prepare stage -> set sequence
    // verifySequenceAt-> first correct -- has listener notify success
    // verifySequenceAt -> first correct -- no listener not notified
    // verifySequenceAt -> first error -- has listener notify error
    // verifySequenceAt -> first  error -- no listener not notified
    // verifySequenceAt -> follow up correct -- has listener notify success
    // verifySequenceAt -> follow up correct -- no listener not notified
    // verifySequenceAt -> follow up error -- no listener not notified error
    // verifySequenceAt -> follow up error -- no listener not notified decrease lifepoint
    // verifySequenceAt -> error -- has listener notify error
    // verifySequenceAt -> error -- has listener notify decrease lifepoint
    // verifySequenceAt -> last success -- has listener notify stage finished
    // verifySequenceAt -> last success -- no listener not notified stage success
    // verifySequenceAt -> error no lifepoints -- has listener notify game over
    // verifySequenceAt -> error no lifepoints -- no listener not notified
    // verifySequenceAt-> error remaining lifepoints -- has listener notify stage failed
    // verifySequenceAt -> error remaining lifepoints -- no listener not notified
    // has remaining life points -> true
    // has remaining life points -> false

    @Test
    public void testSample() {
        // Arrange
        // Act
        // Assert
    }
}