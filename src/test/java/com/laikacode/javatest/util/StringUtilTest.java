package com.laikacode.javatest.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    @Test
    void repeatStringPositiveTimes() {
        assertEquals("HelloHelloHelloHelloHello", StringUtil.repeat("Hello", 5));
    }

    @Test
    void repeatStringZeroTimes() {
        assertEquals("", StringUtil.repeat("Hello", 0));
    }

    @Test
    void repeatStringNegativeTimes() {
        assertThrows(IllegalArgumentException.class, () -> StringUtil.repeat("Hello", -10));
    }
}