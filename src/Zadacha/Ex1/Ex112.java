package Zadacha.Ex1;

import java.util.Scanner;

/**
 * Created by user on 03.11.2017.
 */
public class Ex112 {
    public static void main(String[] args) {
        System.out.println("Введите градусы по Цельсию");
        Scanner in = new Scanner(System.in);
        double c =in.nextDouble();
       double f = c*1.8+32;
       System.out.format("Градусы по шкале Фаренгейта " + "%.2f" + "°F" + "\n" , f);
        double k = c+273.15;
       System.out.format("Градусы по шкале Кельвина " + "%.2f" + "K" + "\n"  , k);
        double p = c*0.8;
        System.out.format("Градусы по шкале Реомюра " + "%.2f" + "°Ré" + "\n", p);
        double d = (100-c)*1.5;
        System.out.format("Градусы по шкале Делиля " + "%.2f" + "°De" + "\n" , d);
        double ce = (f-32)/1.8;
        System.out.format("Градусы по шкале Цельсия " + "%.2f" + "°С" + "\n" , ce);
    }
}
