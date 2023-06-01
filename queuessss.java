import java.util.*;
class queuessss
{
Scanner sc = new Scanner(System.in);
int[]q = new int[10];
int capacity;
int front;
int rear;
queuessss(int cap)
{
capacity = cap;
front = 0;
rear = capacity - 1;
}
void display()
{
if(front < rear)
{
System.out.println("enter the values in the queues>>");
for(int i=front;i<rear;i++)
{
q[i] = sc.nextInt();
System.out.println(q[i]);
}
}
}
void insert(int value)
{
if(rear < capacity && front == 0)
{
q[rear++] = value;
System.out.println("values are entered into the queue!");
}
else
{
System.out.println("queue is full!");
}}
void delete()
{
if (front < rear)
{
System.out.println(q[++front]);
System.out.println("values are deleted from the queue!");
}
else
{
System.out.println("-9999");
System.out.println("no elements in the queue!");
}
}
public static void main(String args[])
{
queuessss q = new queuessss(10);
q.display();
q.insert(10);
q.delete();
}
}
