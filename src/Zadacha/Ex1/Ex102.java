package Zadacha.Ex1;

import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args) {
        System.out.println("Ввести двузначное натуральное число. Вывести на экран количество десятков в нем.");
        Scanner in= new Scanner(System.in);
        System.out.print("Введите двузначное натуральное число: ");
        int x=in.nextInt();
        int y=x/10;

    System.out.println("Количество десятков = "+y);
    }
}