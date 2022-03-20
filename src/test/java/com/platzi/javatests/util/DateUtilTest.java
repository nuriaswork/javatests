package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilTest {
    /*
            TDD Test Drive Development
      Las reglas (requisitos) que tenemos que cumplir:
      1. Todos los años divisibles por 400 son bisiestos (1600, 2000, 2400).
      2. Todos los años divisibles por 100 pero no por 400 NO son bisiestos (1700, 1800, 1900).
      3. Todos los años divisibles por 4 pero no por 100 son bisiestos (1996, 2004, 2008).
      4. Todos los años no divisibles por 4 NO son bisiestos (2017, 2018, 2019).
     */

    @Test
    public void return_true_when_year_is_divisible_by_400() {
        assertTrue(DateUtil.isLeapYear(1600));
        assertTrue(DateUtil.isLeapYear(2000));
        assertTrue(DateUtil.isLeapYear(2400));
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400() {
        assertFalse(DateUtil.isLeapYear(1700));
        assertFalse(DateUtil.isLeapYear(1800));
        assertFalse(DateUtil.isLeapYear(1900));
    }

    @Test
    public void return_true_when_year_is_divisible_by_4_but_not_by_100() {
        assertTrue(DateUtil.isLeapYear(1996));
        assertTrue(DateUtil.isLeapYear(2004));
        assertTrue(DateUtil.isLeapYear(2008));
    }

    @Test
    public void return_false_when_year_is_not_divisible_by_4 () {
        assertFalse(DateUtil.isLeapYear(2017));
        assertFalse(DateUtil.isLeapYear(2019));
        assertFalse(DateUtil.isLeapYear(2018));
    }
}