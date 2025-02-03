package org.test;

import java.util.Arrays;

public class Main {
    public static void testArray(String[][]  arr) throws MyArraySizeException, MyArrayDataException {
        if (arr[0].length != 4 || arr.length != 4){
            throw new MyArraySizeException("не подходит размер");
        }
        int summ = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summ += Integer.valueOf(arr[i][j]).intValue();
                }catch(NumberFormatException e){
                    throw new MyArrayDataException(i+","+j);
                }
            }
        }
        System.out.println("summ = " + summ);
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

         String[][] mass = {
                {"3", "2", "7", "5"},
                {"3", "6", "5", "4"},
                {"3", "1", "6", "6"},
                {"3", "1", "6", "9"}
        };

        String[][] mass2 = {
                {"3", "2", "7", "5"},
                {"3", "6", "5", "4"},
                {"3", "1", "6", "6"},
                {"3", "1", "6", "str"}
        };

        String[][] mass3 = new String[5][4];

        testArray(mass);
        testArray(mass2);
        testArray(mass3);

     }
}