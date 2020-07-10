package com.laikacode.javatest.util;

public class DateUtil {

    /**
     * Is Leap year
     *       -All years divisible by 400 ARE leap years (1600, 2000, 2400),
     *       -All years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900),
     *       -All years divisible by 4 but not by 100 ARE leap years (1996, 2004, 2008),
     *       -All years not divisible by 4 are NOT leap years (2017, 2018, 2019).
     * @param year
     * @return boolean
     * @author Francisco
     * */
    public static boolean isLeapYear(int year){
        return (year % 400 == 0 || year % 100 == 0 || year % 4 == 0);
    }
}
