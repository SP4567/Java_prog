class parent
{
    int a,b;//int a = 10,b = 20;
}
class child extends parent
{
    void add()//super keyword is used to access the data member of the parent class(super class).
    {
    super.a = 10;//int c = super.a;
    super.b = 20;//int s = super.b;
    int sum = super.a + super.b; //int sum = c + s; sopln(sum);
    System.out.println("The sum of two numbers is:"+sum);
    }
    public static void main(String args[])
    {
        child c = new child();
        c.add();
    }   
}
