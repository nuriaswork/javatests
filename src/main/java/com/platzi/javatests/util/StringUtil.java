package com.platzi.javatests.util;

public class StringUtil {

    public static String repeat(String str, int times) {
        if (times < 0){
            throw new IllegalArgumentException("Número de veces negativo no permitido");
        }
        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;

    }
}
