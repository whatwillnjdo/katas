package com.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameTest {
    private Game game;
    @Before
    public void setUp() throws Exception {
       game = new Game();
    }

    @Test
    public void shouldCreateGame() throws Exception {
       assertThat(game, notNullValue());
    }

    @Test
    public void shouldBeAbleToRollPin() throws Exception {
       game.roll(10);
    }

    @Test
    public void shouldBeAbleToRollTwice() throws Exception {
        game.roll(5);
        game.roll(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotBeAbleToRollNegativePins() throws Exception {
        game.roll(-9);
    }
}
