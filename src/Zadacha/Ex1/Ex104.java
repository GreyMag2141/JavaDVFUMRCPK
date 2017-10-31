package Zadacha.Ex1;

import java.util.Scanner;

public class Ex104 {
    public static void main(String[] args) {
        System.out.println("Написать программу, которая находит среднее арифметическое значение трёх вещественных чисел.");
        Scanner in= new Scanner(System.in);
        System.out.println("Введите три вещественных числа");
         double x=1.5, y=2.5, z=3.5;
         double summa=(x+y+z)/3;
        System.out.println("Среднне арифметическое "+"= "+summa);
    }
}