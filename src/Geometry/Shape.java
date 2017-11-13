package Geometry;

/**
 * Created by user on 10.11.2017.
 */

// базовый класс геометрический фигур
public abstract class Shape  {
   public int x,y;
    String color;

    abstract void draw();
    abstract void area();
    abstract void square();
    abstract void serParams(int[] x);
    abstract void setParams(double[] x);


    }
// Типовой класс для прямоугольника

class Rectangle extends Shape {
    int a, b;


    @Override
    void draw() {System.out.println("Рисуем");}
    @Override
    void area() { int x=  2 * a + 2 * b;
        System.out.println(+x);}

    @Override
    void square () { int x= a * b;
        System.out.println(+x); }

    @Override
    void serParams(int[] x) {
        this.a =x[0];
        this.b =x[1];
    }

    @Override
    void setParams(double[] x) {

    }


}
//class  Circle extends Shape{
//    int r;
//    public Circle(){
//        Circle(int r) {this.r=r;}
//            Circle (int x, int y, int r){
//            super(x,y);
//                          }
//        }
//    }
//}
//

