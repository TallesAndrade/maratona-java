package com.talles.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *

        int numberOne = 10;
        int numberTwo = 20;
        int result = numberOne + numberTwo;

        System.out.println(numberTwo + numberOne);

        // %
        int rest = 20 % 2;
        System.out.println(rest);

        // < > <= >=  == !=

        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenEqualsTen = 10 == 10;
        boolean isTenDifferentTen = 10 != 10;
        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty " + isTenLessThanTwenty);
        System.out.println("isTenEqualsTwenty " + isTenEqualsTwenty);
        System.out.println("isTenEqualsTen " + isTenEqualsTen);
        System.out.println("isTenDifferentTen " + isTenDifferentTen);

        // &&(AND) ||(OR) !(NOT)
        int age = 35;
        double wage = 3500;

        boolean isWithinTheLawGreatThanThirty = age > 30 && wage >= 4612;
        boolean isWithinTheLaeLessThanTirty = age < 30 && wage >= 3381;
        System.out.println("isWithinTheLawGreatThanThirty " + isWithinTheLawGreatThanThirty);
        System.out.println("isWithinTheLaeLessThanTirty " + isWithinTheLaeLessThanTirty);

        double valueTotalCorrentAccout = 200;
        double valueTotalSavings = 10000;
        float playstationValue = 5000F;

        boolean isPlaystationFivePurchasable = valueTotalCorrentAccout > playstationValue || valueTotalSavings > playstationValue;
        System.out.println("isPlaystationFivePurchasable " + isPlaystationFivePurchasable);

        // = += -= *= /=

        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        bonus %= 2; //0
        System.out.println(bonus);

    }
}
