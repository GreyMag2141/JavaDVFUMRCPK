package Geometry;

/**
 * Created by user on 09.11.2017.
 */
public class Rectangle {
    // Свойства класса
    public int x,y,a,b;
    String color;

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle( 10, 20);
        Rectangle rect2 = new Rectangle(20, 10);
        int area =
    }
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
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    void
}
