package org.test;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        Main main = new Main();

        printThreeWords();
        ckeckSumSign();
        printColor();
        compareNumbers();
        boolean result =  func5(5, 10);
        System.out.println("result = "+ result);
        func6(5);
        result = main.func7(0);
        System.out.println("result = "+ result);
        func8("Hello", 3);
        result = func9(2000);
        System.out.println("result = "+ result);
        func10();
        func11();
        func12();
        func13(10);
        func14(3, 2);
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

    public static  boolean func5(int a, int b){
        System.out.println("func 5  ");
        int summ = a+b;
        if(summ>=10 && summ <=20) return true;
        return false;
    }

    public static void func6(int a) {
        System.out.println("func 6  ");
        if(a>=0) System.out.println("число положительное");
        else System.out.println("число отрицательное");
    }

    public static boolean func7(int a) {
        System.out.println("func 7  ");
        if(a<0) return true;
        return false;
    }

    public static void func8(String str, int count){
        System.out.println("func 8  ");
        for(int i = 0; i<count; i++){
            System.out.println(str);
        }
    }

    public static boolean func9(int value) {
        System.out.println("func 9  ");
        if (value % 4 == 0 && value % 100 != 0) {
            return true;
        }
        return false;
    }

    public static  void func10(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i<arr.length; i++)
        {
            switch(arr[i]) {
                case 0: arr[i] = 1; break;
                case 1: arr[i] = 0; break;
            }
        }
        System.out.println("func 10 = "+ Arrays.toString(arr));
    }

    public static void func11(){
        int[] arr = new int[100];
        for(int i = 0; i<arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println("func 11 = "+ Arrays.toString(arr));
    }

    public static  void func12(){
        int[] arr= {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i]<6)
                arr[i] = arr[i] *2;
        }
        System.out.println("func 12 = "+ Arrays.toString(arr));
    }

    public static void func13(int count){
        int[][] arr = new int[count][count];
        System.out.println("func 13 ");

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

    public static void func14(int len, int initialValue){
        int[] arr =  new int[len];
        for(int i = 0; i<arr.length; i++){
            arr[i] = initialValue;
        }
        System.out.println("func 14 = "+ Arrays.toString(arr));
    }
}