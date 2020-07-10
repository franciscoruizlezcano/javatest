package com.laikacode.javatest.player;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    /**
     * Como tenemos un comportamiento que no podemos manejar y testear debido al que el dado genera nums aleatorios, simularemos el mismo
     * */

    @Test
    void loosesWhenDiceNumberIsTooLow() {
        //Dice dice = new Dice();

        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(5, dice);
        assertEquals(false, player.play());
    }

    @Test
    void loosesWhenDiceNumberIsTooGreater() {
        //Dice dice = new Dice();

        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(1, dice);
        assertEquals(true, player.play());
    }

    @Test
    void win() {
        //Dice dice = new Dice();

        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(4, dice);
        assertEquals(true, player.play());
    }
}