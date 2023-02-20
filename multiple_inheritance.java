import java.util.*;
interface nums1
{
public void number();
}
interface nums2
{
public void number();
}
public class multiple_inheritance implements nums1, nums2
{
public void number()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter two numbers");
int  a = sc.nextInt();
int  b = sc.nextInt();
int s = a  + b;
System.out.println("sum of two numbers is:"+s);
}
public static void main(String args[])
{
 multiple_inheritance ob = new multiple_inheritance();
ob.number();
}
} 
