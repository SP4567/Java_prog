import java.util.Scanner;
class hierarchialinheritance
{
    int a,b;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
    }
}
class inherit1 extends hierarchialinheritance
{
    int s=0;
    void sum()
    {
        s=a+b;
        System.out.println("sum:"+s);
    }
}
class inherit2 extends hierarchialinheritance
{
    int p=1;
    void prod()
    {
        p=a*b;
        System.out.println("product:"+p);
    }
}
public class test3
{
   public static void main()
   {
       inherit1 i=new inherit1();
       i.input();
       i.sum();
       inherit2 i2=new inherit2();
       i2.input();
       i2.prod();
   }
}