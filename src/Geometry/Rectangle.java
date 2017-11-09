package Geometry;

/**
 * Created by user on 09.11.2017.
 */
public class Rectangle {
    // Свойства класса
    public int x,y,a,b;
    String color;

    // Конструктор
    public Rectangle(){}
    public Rectangle (int a, int b) {
        this.a = a; this.b = b;

    }
    public Rectangle (int x, int y, int a, int b){

    }
    public int square(){
        return  (this.a *this.b);

    }
    int area (){
        return (2*this.a + 2*this.b);
    }
}
