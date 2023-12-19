import java.util.*;
class parent 
{
    Scanner sc = new Scanner(System.in);
    void add()
    {
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
class child1 extends parent
{
    void add()/*when a method is declared in a derived class which is already present in the base class 
    it is called as method overriding, in this case the methid in the derived class gets executed.*/
    {
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int difference = a * b;
        System.out.println(difference);
    }
    public static void main(String args[])
    {
        child c = new child();
        c.add();
    }
}
