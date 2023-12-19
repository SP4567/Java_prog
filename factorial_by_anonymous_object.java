import java.util.*;
class factorial_by_anonymous_object
{
    public void fact()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose factorial has to be calculated:");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact * i;
            System.out.println(fact);
        }
    }
    public static void main(String args[])
    {
        new factorial_by_anonymous_object().fact();
        //anonymous object is nameless object which has no reference,it can be used at the time of object creation.
        //syntax: new <class name()>.<function name()>
    }
}