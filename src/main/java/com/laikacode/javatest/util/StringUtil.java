package com.laikacode.javatest.util;

public class StringUtil {

    public static boolean isEmpty(String str){
        boolean result;

        if(str == null){
            result = true;
        }else{
            result = str.trim().length() == 0;
        }

        return result;
    }

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
