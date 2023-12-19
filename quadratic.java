import java.util.*;
class quadratic
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("let us consider a quadratic equation: ax^2 + bx + c ");
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the value  of c");
        int c =sc.nextInt();
        int discriminant = b*b - 4*a*c;
        if(discriminant > 0)
        {
        System.out.println("note: if we are taking '+' in between -b and Math.sqrt(b^2-4*a*c)");
        double x1 = (-b +(double) Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println(x1);
        System.out.println("note: if we are taking '-' in between -b and Math.sqrt(b^2-4*a*c)");
        double x2 = (-b -(double) Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println(x2);
        System.out.println("The roots of the equation are: "+x1+" and "+x2);
        }
        else if(discriminant == 0)
        {
            System.out.println("Roots is:"+((-b + Math.sqrt(b*b-4*a*c))/(2*a)));
        }
    }
}