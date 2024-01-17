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
    @Mock private Randomizer mRandomizerMock;

    private GameImpl SUT;

    @Before
    public void setUp() {
        //super.setUp();

        SUT = new GameImpl();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testStartAnimation() {
        // Arrange
        // Act
        // Assert
    }

    @Test
    public void testHasRemainingLifePoints() {
    }

    @Test
    public void testPressButton() {
    }

    @Test
    public void testGetLifePoints() {
    }

    @Test
    public void testSetDelay() {
    }

    @Test
    public void testGetDelay() {
    }
}