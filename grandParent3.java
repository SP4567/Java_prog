class parent 
{
    public int a,b;
    public int sum;
    public void addition(int c,int d)
    {
        a = c;
        b = d;
        sum = c + d;
    }
}
class child extends parent
{
    public void opencv()
    {
        System.out.println(sum);
    }
}
class grandParent3
{
    public static void main(String args[])
    {
        child c2 = new child();
        c2.addition(4, 5);
        c2.opencv();
    }
}
