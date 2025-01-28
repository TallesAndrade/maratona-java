package com.talles.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - / *

        int numberOne = 10;
        int numberTwo = 20;
        int result = numberOne+numberTwo;

        System.out.println(numberTwo+numberOne);

        // %
        int rest = 20 % 2;
        System.out.println(rest);

        // < > <= >=  == !=

        boolean isTenGreaterThanTwenty = 10  > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenEqualsTen = 10 == 10;
        boolean isTenDifferentTen = 10 != 10;
        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty " + isTenLessThanTwenty);
        System.out.println("isTenEqualsTwenty "+ isTenEqualsTwenty);
        System.out.println("isTenEqualsTen " + isTenEqualsTen);
        System.out.println("isTenDifferentTen "+ isTenDifferentTen);
    }
}
