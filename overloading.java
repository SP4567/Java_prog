import java.util.Scanner;
class overloading
{
    double ar;
    Scanner sc=new Scanner(System.in);
    void area(int length,int breadth)
    {
        ar=length*breadth;
        System.out.println("area of rectangle is:"+ar);
    }
    void area(int radius)
    {
        double pi=3.14;
        ar=pi*radius*radius;
        System.out.println("area of circle is:"+ar);
    }
    void area()
    {
        int base,height;
        System.out.println("enter base and height of the triangle");
        base=sc.nextInt();
        height=sc.nextInt();
        ar=0.5*base*height;
        System.out.println("area of the triangle is:"+ar);
    }
    double area(double side)
    {
      ar=side*side;
      return ar; 
    }
    void main()
    { 
        overloading o=new overloading();
        o.area(4,5);
        o.area(5);
        o.area();
        o.area(2.5);
    }
}