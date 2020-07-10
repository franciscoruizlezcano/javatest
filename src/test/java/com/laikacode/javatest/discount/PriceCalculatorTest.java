package com.laikacode.javatest.discount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    private PriceCalculator calculator;

    @BeforeEach
    void setUp() {
        this.calculator = new PriceCalculator();
    }

    @Test
    void totalIsZeroWhenPricesEqualZeroOrNull() {
        setUp();
        this.calculator.setDiscount(20);
        this.calculator.addPrice(0);
        assertEquals(0, this.calculator.getTotal());
    }

    @Test
    void totalIsTheSumOfPrices() {
        setUp();
        this.calculator.addPrice(100);
        this.calculator.addPrice(100);
        assertEquals(200, this.calculator.getTotal());
    }

    @Test
    void totalIsTheSumOfPricesLessDiscount() {
        setUp();
        this.calculator.setDiscount(20);
        this.calculator.addPrice(1000);
        assertEquals(800, this.calculator.getTotal());
    }
}