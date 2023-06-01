class parent 
{
protected int sum = 0;
public int sum(int a,int b)
{
sum = a+b;
return sum;
}
}
class child extends parent
{
public void display_sum(int x,int y)
{
int c = sum(x,y);
System.out.println(c);
}
}
class grandparentttt
{
public static void main(String args[])
{
child cd = new child();
cd.display_sum(1,2);
}
}
