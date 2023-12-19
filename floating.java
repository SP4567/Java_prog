import java.util.*;
class floating
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first floating point number");
        float n1=sc.nextFloat();
        System.out.println("enter first floating point number");
        float n2=sc.nextFloat();
        n1 = n1 / 1000;
        n2 = n2 / 1000;
        if(n1 == n2)
        System.out.println("Numbers are equal upto three decimal place!");
        else
        System.out.println("Numbers are not equal upto three decimal place!");
    }
} 
