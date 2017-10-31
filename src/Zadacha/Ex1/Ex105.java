package Zadacha.Ex1;

import java.util.Scanner;

public class Ex105 {
    public static void main(String[] args) {
        System.out.println("Написать программу, которая находит корень линейного уравнения ax + b = 0");
        Scanner in= new Scanner(System.in);
        System.out.println("Введите a, b:");
               System.out.print("Первое число: ");
                int a = in.nextInt();
                System.out.print("Второе число: ");
                int b = in.nextInt();
        int x=-b/a;
        System.out.println("Корень линейного уравнения = "+x);
    }
}