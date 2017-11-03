package Zadacha.Ex1;

import java.util.Scanner;

/**
 * Created by user on 03.11.2017.
 */
public class Ex113 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("а и б");

       int a = in.nextInt();
        int b = in.nextInt();
        int c;
c=a;
a=b;
b=c;

       System.out.println(a,b);


    }



}
