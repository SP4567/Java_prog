import java.util.*;
class cube
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the limit ");
        int limit = sc.nextInt();
        System.out.println("\n");
        for (int i = 1;i <= limit;i++)
        {
            int Cube = (int)Math.pow(i,3);//type casting done for Math.pow
            System.out.println("Number is: "+i+" and cube is: "+Cube);
        }
    }
}