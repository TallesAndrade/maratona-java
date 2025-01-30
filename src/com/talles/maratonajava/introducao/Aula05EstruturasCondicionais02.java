package com.talles.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //age < 15 children's category
        //age >= 15 && age < 18 youth category
        //age > 18 adult category
        int age = 12;

        String category;

        if (age < 15){
          category =  "Children's Category";
        } else if (age >= 15 && age < 18) {
            category =  "Youth Category";
        }else {
            category =  "Adult Category";
        }

        System.out.println(category);
    }
}
