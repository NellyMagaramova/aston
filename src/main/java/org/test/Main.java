package org.test;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        String[][] mass = new String[4][4];
        String[][] mass2 = new String[4][4];
        String[][] mass3 = new String[5][4];

        mass[0][0] = "34";
        mass[0][1] = "11";
        mass[0][2] = "23";
        mass[0][3] = "24";
        mass[1][0] = "26";
        mass[1][1] = "27";
        mass[1][2] = "28";
        mass[1][3] = "29";
        mass[2][0] = "30";
        mass[2][1] = "31";
        mass[2][2] = "32";
        mass[2][3] = "33";
        mass[3][0] = "34";
        mass[3][1] = "35";
        mass[3][2] = "36";
        mass[3][3] = "37";

        mass2[0][0] = "34";
        mass2[0][1] = "11";
        mass2[0][2] = "23";
        mass2[0][3] = "24";
        mass2[1][0] = "26";
        mass2[1][1] = "27";
        mass2[1][2] = "28";
        mass2[1][3] = "29";
        mass2[2][0] = "30";
        mass2[2][1] = "31";
        mass2[2][2] = "32";
        mass2[2][3] = "33";
        mass2[3][0] = "34";
        mass2[3][1] = "35";
        mass2[3][2] = "36";
        mass2[3][3] = "str";

        testArray(mass);
        testArray(mass2);
        testArray(mass3);

     }
}