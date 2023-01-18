import java.util.*;
class fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
int limit = sc.nextInt();
int c = 0;
int a = 0;
int b = 1;
System.out.print(" "+a+" "+b);
for(int i=1;i<limit;i++)
{
c = a+b;
System.out.print(" "+c);
a = b;
b = c;
}
}
}

