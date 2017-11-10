package Geometry;

/**
 * Created by user on 10.11.2017.
 */

// базовый класс геометрический фигур
public class Shape {
   public int x,y;
    String color;

    void draw(){};
    void area(){};
    void square(){};

    }
// Типовой класс для прямоугольника

class Rectangle extends Shape {
    int a, b;

    void draw() {System.out.println("Рисуем");}

    void area() {int area1 = 2 * a + 2 * b;
        System.out.println(+area1);}

    void square() {int square1 = a * b;
        System.out.println(+square1);}
}

