package com.laikacode.javatest.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {
    /**
     * Lo común, es tener un método por cada caso de uso de la funcionalidad que queremos probar
     * */
    @Test
    void weakWhenHasLessThan8Letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    void weakWhenHasOnlyLetters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    void mediumWhenHasLettersAndNumbers() {
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }

    @Test
    void strongWhenHasLettersNumbersAndSymbols() {
        assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }
}