class exp extends exception
{
public exp()
{
System.out.println(str);
}
}
class use
{
public static void main(String args[])
{
try
{
throw new exp("Error:Exception");
}
catch(Exp e)
{
System.out.println(e);
}
}
}