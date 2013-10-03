package com.roundtriangles.games.zaria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AbstractGameTest {

    private class TestGame extends AbstractGame<TestGame> {

        @Override
        public LoadingScreen<TestGame> getLoadingScreen() {
            return null;
        }

        @Override
        public AbstractScreen<TestGame> getMainMenuScreen() {
            return null;
        }

        @Override
        public void initialize() {
        }

    }

    @BeforeClass
    public static void beforeClass() {
    }

    @AfterClass
    public static void afterClass() {
    }

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    @Test
    public void testGame() {
        AbstractGame<TestGame> testGame = new TestGame();
        Assert.assertNull(testGame.getMainMenuScreen());
    }

}
