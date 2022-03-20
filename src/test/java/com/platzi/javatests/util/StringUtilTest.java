package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void repiteOK() {
        assertEquals("holahola",StringUtil.repeat("hola",2));
    }

    @Test
    public void repite0(){
        assertEquals("",StringUtil.repeat("hff",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repiteVecesNegativo(){
        StringUtil.repeat("hff",-3);
    }
}