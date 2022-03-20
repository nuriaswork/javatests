package com.platzi.javatests.discounts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//En TDD se suele poner Should en lugar de Tests
public class PriceCalculatorShould {

    PriceCalculator calculator;

    @Before
    public void setUp(){
        calculator=new PriceCalculator();

    }

    @Test
    public void price_zero_when_no_prices() {
       Assert.assertEquals(  0.0 , calculator.getTotal(),0.1);
    }

    @Test
    public void total_is_sum_of_prices() {
        calculator.addPrice(1.2);
        calculator.addPrice(3.9);
        assertEquals(5.1, calculator.getTotal(),0.1);
    }

    @Test
    public void apply_discount_50() {
        calculator.addPrice(12.5);
        calculator.addPrice(17.5);
        calculator.setDiscount(50);
        assertEquals(15.0, calculator.getTotal(),0.1);
    }


    @Test
    public void apply_discount_25() {
        calculator.addPrice(25.0);
        calculator.addPrice(25.0);
        calculator.addPrice(25.0);
        calculator.addPrice(25.0);
        calculator.setDiscount(25);
        assertEquals(75.0, calculator.getTotal(),0.1);

    }
}
