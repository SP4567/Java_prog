import java.util.*;
class exception
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numerator");
        int numerator = sc.nextInt();
        System.out.println("enter denominator");
        System.out.println("note:if denominator entered is zero then it will generate an exception!");
        int denominator = sc.nextInt();
        int result;
        try
        {
         result = numerator/denominator;
         System.out.println(result);
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("ZeroDivisionError:user tried to divide the numerator by zero.");
        }
        finally{
            System.out.println("Finally block is an option block which always executes whether error occurs or not!");
        }
    }
}