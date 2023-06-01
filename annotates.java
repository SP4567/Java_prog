class deposit
{
void m()
{
System.out.println("hello m");
}
@Deprecated
void n()
{
System.out.println("hello n");
}
}
class annotates
{
public static void main(String args[])
{
deposit d = new deposit();
d.n();
}
}
