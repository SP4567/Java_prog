import java.util.*;
class exceptions
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numerator");
        int numerator = sc.nextInt();
        System.out.println("enter denominator");
        int denominator = sc.nextInt();
        int result;
        try
        {
         if(denominator == 0)
         System.out.println("if denominator is 0,Its a zero division error!");
         else{
         result = numerator/denominator;
         System.out.println(result);
         }
        }
        catch(Exception e)
        {
            System.out.println("exception caught!");
        }
        finally{
            System.out.println("Finally block is an option block which always executes whether error occurs or not!");
        }
    }
}