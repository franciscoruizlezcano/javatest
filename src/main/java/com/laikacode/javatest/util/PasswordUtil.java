package com.laikacode.javatest.util;

public class PasswordUtil {
    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }

    /*
    * @author Francisco
    * @return {@link com.laikacode.javatest.util.SecurityLevel}
    * @param String
    * */
    public static SecurityLevel assessPassword(String password){
        SecurityLevel response = SecurityLevel.WEAK;

        /*
        * Expresiones regulares
        * ^                   start-of-string
        * ([0-9])             a digit must occur at least once
        * ([a-z])             a lower case letter must occur at least once
        * ([A-Z])             an upper case letter must occur at least once
        * ([@#$%^&+=])    a special character must occur at least once
        * (?=\S+$)            no whitespace allowed in the entire string
        * .{8,}               anything, at least eight places though
        * $                   end of string
        * +                   can be repeated several times
        * */

        if(password.length() >= 8 && !password.matches("[a-zA-Z]+")){
            if(password.matches("[a-zA-Z0-9]+")){
                response = SecurityLevel.MEDIUM;
            } else{
                response = SecurityLevel.STRONG;
            }
        }
        return response;
    }
}
