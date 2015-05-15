package ru.testguihw.calculateoperations;

/**
 * Created by Nikolay on 17.04.2015.
 */
public class MathOperations {

    public static float add (float num1, float num2){
        return num1+num2;
    }

    public static float difference(float num1, float num2){
        return num1-num2;
    }

    public static float multiplication(float num1, float num2){
        return num1*num2;
    }

    public static float divide(float num1, float num2){
        return num1/num2;
    }

    public static boolean isDigit(String s){
        char[] sArray = s.toCharArray();
        for(int i =0; i < sArray.length; i++){
            if (!Character.isDigit(sArray[i]))return false;
        }
        return true;
    }
}
