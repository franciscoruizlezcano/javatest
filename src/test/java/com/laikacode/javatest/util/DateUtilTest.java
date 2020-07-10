package com.laikacode.javatest.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilTest {
    /**
     * Is Leap year
     *       -All years divisible by 400 ARE leap years (1600, 2000, 2400),
     *       -All years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900),
     *       -All years divisible by 4 but not by 100 ARE leap years (1996, 2004, 2008),
     *       -All years not divisible by 4 are NOT leap years (2017, 2018, 2019).
     * @author Francisco
     * */

    @BeforeEach
    void setUp() {

    }

    @Test
    void isLeapYearWhenYearIsDivisibleBy400() {
        assertTrue(DateUtil.isLeapYear(1600));
        assertTrue(DateUtil.isLeapYear(2000));
        assertTrue(DateUtil.isLeapYear(2400));
    }

    @Test
    void isLeapYearWhenYearIsDivisibleBy100BuNotBy400() {
        assertTrue(DateUtil.isLeapYear(1700));
        assertTrue(DateUtil.isLeapYear(1800));
        assertTrue(DateUtil.isLeapYear(1900));
    }

    @Test
    void isLeapYearWhenYearIsDivisibleBy4BuNotBy100() {
        assertTrue(DateUtil.isLeapYear(1996));
        assertTrue(DateUtil.isLeapYear(2004));
        assertTrue(DateUtil.isLeapYear(2008));
    }

    @Test
    void isNotLeapYearWhenYearIsNotDivisibleBy4() {
        assertFalse(DateUtil.isLeapYear(2017));
        assertFalse(DateUtil.isLeapYear(2018));
        assertFalse(DateUtil.isLeapYear(2019));
    }
}