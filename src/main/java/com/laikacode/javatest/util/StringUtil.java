package com.laikacode.javatest.util;

public class StringUtil {
    public static String repeat(String str, int times){
        if(times > 0){
            String result = "";
            for (int i = 0; i < times; i++) {
                result += str;
            }
            return result;
        }else{
            throw new IllegalArgumentException("times negative");
        }

    }
}
