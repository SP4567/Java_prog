class parent 
{
    protected int a,b;
    protected int sum = 0;
    public void numbers(int x,int y)
    {
        a = x;
        b = y;
        sum = x + y;
    }
}
class child extends parent
{
    public void print_sum(int s,int t)
    {
        numbers(s,t);
        System.out.println(sum);
    }   
}
class grandParent2
{
    public static void main(String args[])
    {
        child c = new child();
        c.print_sum(1, 2);
    }
}