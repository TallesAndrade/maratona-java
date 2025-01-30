package com.talles.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 20;
        boolean isAuthorizedPuchaseAlcooholicBeverages = age >= 18;
        if (isAuthorizedPuchaseAlcooholicBeverages){
            System.out.println("Authorized to puchase alcoholic beverages");
        }else {
            System.out.println("Not allowed to buy alcoholic beverages");

        }
        if (!isAuthorizedPuchaseAlcooholicBeverages){
            System.out.println("Not allowed to buy alcoholic beverages");
        }

        System.out.println("Fora do if");
    }
}
