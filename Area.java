import java.util.*;
abstract class Shape
{
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    void printArea(){};
}
class Rectangle extends Shape
{
    void printArea()
    {
    double areaRec = a * b;
    System.out.println("Area of Rectangle: "+areaRec);  
    } 
}
class Triangle extends Shape
{
    void printArea()
    {
    double areaTri = 0.5 * a * b;
    System.out.println("Area of Triangle: "+areaTri);
    }
}
class Circle extends Shape
{
    void printArea()
    {
    final double pi = 3.14; 
    double areaCir = pi * a * a;
    System.out.println("Area of Triangle: "+areaCir);
    }
}
class Area
{
public static void main(String args[])
{
   Rectangle r = new Rectangle();
   r.printArea();
   Triangle t = new Triangle();
   t.printArea();
   Circle c = new Circle();
   c.printArea();
}
}