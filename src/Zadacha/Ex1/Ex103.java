package Zadacha.Ex1;

import java.util.Scanner;

public class Ex103 {
    public static void main(String[] args) {
        System.out.println("Дано целое число n. Выведите следующее за ним четное число.");
        Scanner in= new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int x=in.nextInt();
        int y=x+2-x%2;
    System.out.println("Следующее за ним четное число = "+y);
    }
}