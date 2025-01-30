package com.talles.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = 6000;
        String messageDonate = "I will donate";
        String doNotDonateMessage = "I don't have conditions yet, but i will";
        //(condition) ? true : false
        String result = (salary > 50) ? messageDonate : doNotDonateMessage;

        System.out.println("Enter you salary");
        double salaryTwo = scanner.nextDouble();

        if (salaryTwo >= 0 && salaryTwo <= 34.712){
            System.out.println("You will pay 9.70% of tax");
        } else if (salaryTwo >= 34.713 && salaryTwo <= 68.507) {
            System.out.println("You will pay 37.35% of tax");
        }else {
            System.out.println("You will pay 49.50% of tax");
        }


    }
}
