class A
{
void eatsomething()
{
System.out.println("eat maggie");
}
}
class B extends A
{
@override
void eatsomthing()
{
System.out.println("eat chocolates");
}
}
class annotation
{
public static void main(String args[])
{
B c = new B();
c.eatsomething();
}
}