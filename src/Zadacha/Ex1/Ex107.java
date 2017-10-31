package Zadacha.Ex1;

import java.util.Scanner;

public class Ex107 {
    public static void main(String[] args) {
        System.out.println("Программа  предлагает ввести радиус окружности, а затем считает площадь и длину этой окружности.");
        Scanner in= new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double r =in.nextDouble();
        double p = Math.PI*(r*r); //Площадь круга
        System.out.println("Площадь круга равна: " + p);
        double d = Math.PI*2*r;   //Длины окружности
        System.out.println("Длины окружности равна: " + d);
    }
}