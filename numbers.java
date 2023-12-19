import java.util.*;

import javax.lang.model.util.ElementScanner14;
class numbers
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter three numbers");
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       int n3 = sc.nextInt();
       if(n1<n2 && n2<n3)
       {
         System.out.println("Numbers are in increasing order"+n1+" "+n2+" "+n3);
       }
       else if(n1>n2 && n2>n3)
       {
        System.out.println("Numbers are in decreasing oreder");
       }
       else 
       {
        System.out.println("Numbers are neither increasing nor decreasing");
       }
    }
}
