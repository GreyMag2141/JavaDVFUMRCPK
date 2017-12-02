package Classwork;

/**
 * Created by user on 23.11.2017.
 */
//import java.util.Date;
//import java.util.Locale;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Locale;

public class Time {
    public static void main(String[] args) {
//import java.time.LocalDate;


//        Date d = new Date();
//        System.out.println(d);

    //    System.out.println(LocalDate.now());
   LocalDate date = LocalDate.now();
//        System.out.println(date);
//        System.out.println(date.minusYears(1));
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd MMMM u", Locale.CHINA);
        System.out.println(dft.format(date));
    }
}
