import java.util.*;
class largest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter three numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            //int s = (a<b)?a:b;
            //int d = (s<c)?c:s;
            if(a<b)
            {
                System.out.println("b is greater");
            }
            else if(b<c)
            {
                System.out.println("c is greater and b");
            }
            else 
            {
                System.out.println("c is greatest");
            }
        }
    }
}