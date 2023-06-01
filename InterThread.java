class Q
{
int num;
public void put(int num)
{
this.num = num;
}
public void get()
{
while(valueSet)
{
try(wait();) catch(Exception e){}
}
System.out.println(num);
this.num = num;
valueSet = true;
}
}
class Producer implements Runnable
{
Q q;
public Producer(Q q)
{
this.q = q;
Thread t = new Thread(this,"Producer");
t.start();
}
public void run()
{
int i = 0;
while(true)
{
q.put(i++);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class consumer implements Runnable
{
Q q;
public void Consumer(Q q)
{
this.q = q;
Thread t = new Thread(this,"Consumer");
t.start();
}
public void run()
{
while(true)
{
q.get();
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
public class InterThread
{
public static void main(String args[])
{
Q q = new Q();
new Producer();
new consumer();
}
}
