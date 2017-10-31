package Zadacha.Ex1;

import java.util.Scanner;

public class Ex108 {
    public static void main(String[] args) {
        System.out.println("Программа  предлагает возможность ввести  количество рублей, и переводит его в доллары и евро.");
        Scanner in= new Scanner(System.in);
        System.out.print("Введите количество рублей: ");
        double r =in.nextDouble();
        double s = r*55.5;
        System.out.println("Доллары: " + s);
        double e = r*66.6;
        System.out.println("Евро: " + e);
    }
}