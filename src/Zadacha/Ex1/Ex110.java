import java.util.Scanner;

public class Ex110 {
    public static void main(String[] args) {
        System.out.println("Программа находит процент P от суммы S. ");
        Scanner in= new Scanner(System.in);
        System.out.print("Введите процент: ");
        double p =in.nextDouble();
        System.out.print("Введите сумму ");
        double s =in.nextDouble();
        double x = (s/100)*p;
        System.out.println("= " + x);


    }
}
