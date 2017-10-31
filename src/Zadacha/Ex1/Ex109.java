package Zadacha.Ex1;

import java.util.Scanner;

public class Ex109 {
    public static void main(String[] args) {
        System.out.println("Программа переводит километры в сухопутные и морские мили. ");
        Scanner in= new Scanner(System.in);
        System.out.print("Введите километры: ");
        double x =in.nextDouble();
        double s = x*0.6213711922373341;
        System.out.format("Cухопутные мили: " + "%.2f \n" , s);
        double m = x*0.5399568034557236;
        System.out.format("Морские мили: " + "%.2f \n" ,  m);

    }
}