import java.util.Scanner;
class table
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
      int prod=1,n,i,limit;
      System.out.println("enter the limit");
      limit=sc.nextInt();
      System.out.println("enter a number whose table has to be displayed");
      n=sc.nextInt();
      for(i=0;i<limit;i++)
      {
        prod=n*i;
        System.out.println(n+"*"+i+"="+prod);
      }
    }
}