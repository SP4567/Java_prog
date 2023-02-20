import java.io.*;
class threads extends Thread
{
    public void gm()
    {
       for(int i = 0;i < 100;i++)
       {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Good Morning");
       }
    }
}
class threads2 extends Thread
{
    public void hello()
    {
       for(int i = 0;i < 100;i++)
       try
       {
           Thread.sleep(2000);
       } 
       catch(InterruptedException e)
       {
        System.out.println(e);
       }
       System.out.println("Hello");
    }
}
class threads3 extends Thread
{
    public void wlcm()
    {
        for(int i=0;i<100;i++)
        {
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {
               System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
class threads4
{
   public static void main(String args[])
   {
      threads t1 = new threads();
      threads2 t2 = new threads2();
      threads3 tt = new threads3();
      Thread t3 = new Thread(tt);
      t1.setName("One");
      t2.setName("Two");
      t3.setName("Three");
      System.out.println(t1);
      System.out.println(t2);
      System.out.println(t3);
      Thread t = Thread.currentThread();
      System.out.println(t);
      t1.start();
      t2.start();
      t3.start();
   }
}