class parents
{
    private int a,b;
    private int sum = 0;
    public int add(int s1,int s2)
    {
        a = s1;
        b = s2;
        sum  = s1+s2;
        return sum;
    }
}
class son_daughter extends parents
{
    public void display_sum(int x,int y)
    {
        int c = add(x,y);
        System.out.println(c);
    }
}
public class grandParent
{
    public static void main(String args[])
    {
        son_daughter sd = new son_daughter();
        sd.display_sum(5, 6);
    }   
}

