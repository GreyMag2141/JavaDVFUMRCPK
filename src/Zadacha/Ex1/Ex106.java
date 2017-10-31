package Zadacha.Ex1;

import java.util.Scanner;

public class Ex106 {
    public static void main(String[] args) {
        System.out.println("Программа вычисляет указанную степень этого числа.");
        Scanner in= new Scanner(System.in);
        System.out.print("Введите число: ");
           int a = in.nextInt();
        System.out.print("Введите степень: ");
           int b = in.nextInt();
        double x = Math.pow(a,b);

        System.out.println("Равно = " +x);
    }
}