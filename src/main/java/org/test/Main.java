package org.test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void printThreeWords(){
        String a = "Orange";
        String b = "Banana";
        String c = "Apple";
        System.out.println(a + '\n'+ b + '\n' + c);
    }

    public void ckeckSumSign(){
        int a, b;
        a = 8;
        b = 9;
        int summ = a + b;
        if(summ>=0)  System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public void printColor(){
        int value = 1;
        if(value<=0)  System.out.println("Красный");
        if(value>0 && value <= 100)  System.out.println("Желтый");
        if(value >= 100)  System.out.println("Зеленый");
    }

    public void compareNumbers(){
        int a,b;
        a = 5;
        b = 7;
        if(a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    public boolean func1(int a, int b){
        int summ = a+b;
        if(summ>=10 && summ <=20) return true;
        return false;
    }

    public void func2(int a) {
        if(a>=0) System.out.println("число положительное");
        else System.out.println("число отрицательное");
    }

    public boolean func3(int a) {
        if(a<0) return true;
        return false;
    }

    public void func4(String str, int count){
        for(int i = 0; i<count; i++){
            System.out.println(str);
        }
    }

public boolean func5(int value) {
    if (value % 4 == 0 && value % 100 != 0) {
        return true;
    }
    return false;
}
//
    public  void func6(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i<arr.length; i++)
        {
            switch(arr[i]) {
                case 0: arr[i] = 1; break;
                case 1: arr[i] = 0; break;
            }
            System.out.println(arr[i]);
        }
    }

    public void func7(){
        int[] arr = new int[100];
        for(int i = 0; i<arr.length; i++){
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
    }

    public  void func8(){
        int[] arr= {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i]<6)
                arr[i] = arr[i] *2;
            System.out.println(arr[i]);
        }
    }

    public void func9(int count){
        int[][] array = new int[count][count];

        for (int i = 1; i < count; i++) {
            for (int j = 1; j < count; j++) {
                if (i == j) {
                    array[i][j]=1;
                }else {
                    array[i][j]=0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void func10(int len, int initialValue){
        int[] arr =  new int[len];
        for(int i = 0; i<arr.length; i++){
            arr[i] = initialValue;
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.printThreeWords();
        main.ckeckSumSign();
        main.printColor();
        main.compareNumbers();

        boolean result =  main.func1(5, 10);
        System.out.println("result = "+ result);
        main.func2(5);
        result = main.func3(0);
        System.out.println("result = "+ result);
        main.func4("Hello", 3);
        result = main.func5(2000);
        System.out.println("result = "+ result);
        main.func6();
        main.func7();
        main.func8();
        main.func9(10);
        main.func10(3, 2);
    }
}