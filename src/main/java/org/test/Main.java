package org.test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        ckeckSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkAmountRange(5, 10));
        identifySign(5);
        System.out.println(checkPositiveNumber(0));
        repeatString("Hello", 3);
        System.out.println(visokos(2000));
        changeByte();
        fillArray();
        multiplyTwo();
        fillDiagonally(10);
        arrayInitialValue(3, 2);
    }

    public static void printThreeWords(){
        String a = "Orange";
        String b = "Banana";
        String c = "Apple";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void ckeckSumSign(){
        int a, b;
        a = 8;
        b = 9;
        int summ = a + b;
        if(summ>=0)  System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor(){
        int value = 1;
        if(value<=0)  System.out.println("Красный");
        if(value>0 && value <= 100)  System.out.println("Желтый");
        if(value >= 100)  System.out.println("Зеленый");
    }

    public static void compareNumbers(){
        int a,b;
        a = 5;
        b = 7;
        if(a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    public static  boolean checkAmountRange(int a, int b){
        System.out.println("checkAmountRange  ");
        int summ = a+b;
        if(summ>=10 && summ <=20) return true;
        return false;
    }

    public static void identifySign(int a) {
        System.out.println("identifySign  ");
        if(a>=0) System.out.println("число положительное");
        else System.out.println("число отрицательное");
    }

    public static boolean checkPositiveNumber(int a) {
        System.out.println("checkPositiveNumber2  ");
        if(a<0) return true;
        return false;
    }

    public static void  repeatString(String str, int count){
        System.out.println("repeatString  ");
        for(int i = 0; i<count; i++){
            System.out.println(str);
        }
    }

    public static boolean visokos(int value) {
        System.out.println("visokos  ");
        if (value % 4 == 0 && value % 100 != 0) {
            return true;
        }
        return false;
    }

    public static  void changeByte(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i<arr.length; i++)
        {
            switch(arr[i]) {
                case 0: arr[i] = 1; break;
                case 1: arr[i] = 0; break;
            }
        }
        System.out.println("changeByte = "+ Arrays.toString(arr));
    }

    public static void fillArray(){
        int[] arr = new int[100];
        for(int i = 0; i<arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println("fillArray = "+ Arrays.toString(arr));
    }

    public static  void multiplyTwo(){
        int[] arr= {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i]<6)
                arr[i] = arr[i] *2;
        }
        System.out.println("multiplyTwo = "+ Arrays.toString(arr));
    }

    public static void fillDiagonally(int count){
        int[][] arr = new int[count][count];
        System.out.println("fillDiagonally ");

        for (int i = 1; i < count; i++) {
            for (int j = 1; j < count; j++) {
                if (i == j) {
                    arr[i][j]=1;
                }else {
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayInitialValue(int len, int initialValue){
        int[] arr =  new int[len];
        for(int i = 0; i<arr.length; i++){
            arr[i] = initialValue;
        }
        System.out.println("arrayInitialValue = "+ Arrays.toString(arr));
    }
}