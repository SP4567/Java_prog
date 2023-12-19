public class number {
    void even_odd(int n)
    {
        if(n%2==0)
        System.out.println("number is even");
        else
        System.out.println("number is not even");
    }
    public static void main(String args[])
    {
        new number().even_odd(2);
    }
}
