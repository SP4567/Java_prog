import java.util.*;
interface nums1
{
    public void number();
}
interface nums2
{
    public void number();
}
class multiple_inheritance
{
    Scanner sc = new Scanner(System.in);
    public void number()
    {
        System.out.println("enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of two number is: "+sum);
    }
    public static void main(String args[])
    {
        multiple_inheritance m = new multiple_inheritance();
        m.number();
    }
}