package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println(name + ", enter your password");

        Scanner scanner2 = new Scanner(System.in);
        String password1 = scanner2.next();
        String password2 = "12345";
        if (password1.equals(password2))
            System.out.println("Пароль верный");
        else System.out.println("Пароль не верный");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность цыфр: ");
        int value = scanner.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Обраная последовательность цыфр: " + mirror);
    }

 }


