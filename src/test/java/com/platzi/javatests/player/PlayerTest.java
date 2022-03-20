package com.platzi.javatests.player;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void looses() {
        //Dice dice = new Dice(6);
        //El dado es random y el test fallará aleatoriamente. Hacemos un mock para simular un dice
        //que devuelva siempre el mismo número:
        Dice dice = Mockito.mock(Dice.class); //dado simulado
        Mockito.when(dice.roll()).thenReturn(2); //forzamos que el dado devuelva siempre 2

        Player player = new Player(dice,3); //para ganar debe ser >3
        assertFalse(player.play()); //el dado devuelve siempre 2, y como tiene que ser >3, pierde

    }

    @Test
    public void wins() {
        //Dice dice = new Dice(6);
        //El dado es random y el test fallará aleatoriamente. Hacemos un mock para simular un dice
        //que devuelva siempre el mismo número:
        Dice dice = Mockito.mock(Dice.class); //dado simulado
        Mockito.when(dice.roll()).thenReturn(4); //forzamos que el dado devuelva siempre 4

        Player player=new Player(dice,3); //para ganar debe ser >3
        assertTrue(player.play()); //el dado devuelve siempre 4, y como tiene que ser >3, gana
    }

}