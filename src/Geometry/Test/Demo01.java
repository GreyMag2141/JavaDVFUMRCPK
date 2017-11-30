package Geometry.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) throws Exception {
//Поток ввода из файла
        FileInputStream fileInputStream = new FileInputStream("c:/test/2.txt");
        // Буфферизированное чтение
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        //Массив
        List<String> array = new ArrayList<>();
        //Цикл для чтения
        while (bufferedReader.ready()){
            // Операция ввода данных в массив
            array.add(bufferedReader.readLine());
        }
             // ВЫвод данных
            for (String s: array){
                System.out.println(s);
            }
        }


}