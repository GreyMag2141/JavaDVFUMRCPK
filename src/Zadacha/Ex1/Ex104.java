package Zadacha.Ex1;

import java.util.Scanner;

public class Ex104 {
    public static void main(String[] args) {
        System.out.println("Написать программу, которая находит среднее арифметическое значение трёх вещественных чисел.");
        Scanner in= new Scanner(System.in);
        System.out.println("Введите три вещественных числа: ");
        // double x=1.5, y=2.5, z=3.5;
        double x,y,z;
        System.out.print("Первое число с запятой: ");
       x=in.nextDouble();
        System.out.print("Второе число с запятой: ");
       y=in.nextDouble();
        System.out.print("Третье число с запятой: ");
       z=in.nextDouble();

        double summa=(x+y+z)/3;

        System.out.format("Среднне арифметическое = " + "%.2f" , +summa);
    }
}