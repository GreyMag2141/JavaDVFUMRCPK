package Zadacha.Ex1;

import java.util.Scanner;

public class Ex107 {
    public static void main(String[] args) {
        System.out.println("Программа  предлагает ввести радиус окружности, а затем считает площадь и длину этой окружности.");
        Scanner in= new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double r =in.nextDouble();
        double p = Math.PI*(r*r); //Площадь круга
        System.out.format("Площадь круга равна: " + "%.5f \n" , p);
        double d = Math.PI*2*r;   //Длины окружности
        System.out.format("Длины окружности равна: " + "%.5f \n" , d);
    }
}