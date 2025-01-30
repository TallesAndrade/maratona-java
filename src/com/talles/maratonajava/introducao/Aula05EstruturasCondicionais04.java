package com.talles.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        if (salary >= 0 && salary <= 34712) {
            double tax = 9.70 / 100;
            double taxAmount = salary * tax;
            System.out.println("You will pay 9.70% of tax. The tax amount is: " + taxAmount);
        } else if (salary >= 34713 && salary <= 68507) {
            double tax = 37.35 / 100;
            double taxAmount = salary * tax;
            System.out.println("You will pay 37.35% of tax. The tax amount is: " + taxAmount);
        } else {
            double tax = 49.50 / 100;
            double taxAmount = salary * tax;
            System.out.println("You will pay 49.50% of tax. The tax amount is: " + taxAmount);
        }

        scanner.close(); // Não se esqueça de fechar o scanner!
    }
}
