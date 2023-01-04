import java.util.Scanner;
class single_inheritance
{
    int a,b;
    Scanner sc=new Scanner(System.in);
    single_inheritance()
    {
      a=0;
      b=0;
    }
    void get_data()
    {
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }
}
class inherit extends single_inheritance
{
    int sum=0;
    void sum()
    {
        sum=a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("sum of two number is:"+sum);
    }
}
public class test
{
    public static void main()
    {
        inherit i=new inherit();
        i.get_data();
        i.sum();
    }
}
