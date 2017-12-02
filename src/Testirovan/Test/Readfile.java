package Testirovan.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by user on 02.12.2017.
 */
public class Readfile {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("c:/test/2.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        List<String> array = new ArrayList<>();

    while (bufferedReader.ready());
    System.out.println(bufferedReader.readLine());

    for (String s : array) {
        System.out.println(s);
    }
}
}

