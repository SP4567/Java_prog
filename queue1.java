import java.util.*;
class queue1 
{ 
  int stk[]= new int[10];
  int front=0;
  int rear=10;
  int capacity;
  Scanner sc = new Scanner(System.in);
  void display()
  {
    if(front<rear)
    {
      System.out.println("enter elements  in the queue");
        for(int i=front;i<rear;i++)
        {
          stk[i] = sc.nextInt();
        }
        for(int i=front;i<rear;i++)
        {
        System.out.println(stk[i]);
        }
    }
    else
    {
    System.out.println("queue is empty...");}
  }
  void insert()
  {
    if(rear<capacity)
    {
        if(front == 0)
        {
            stk[rear++] = sc.nextInt();
        }
    }
    else
    {
      System.out.println("queue is full!");
    }
  }
  void remove()
  {
    if(front<rear)
    {
        System.out.println(stk[++front]);
    }
    else
    {
        System.out.println("queue is empty values can be added in the queue!");
        System.out.println(-9999);
    }
  }
  public static void main(String args[])
  {
    queue1 q = new queue1();
    q.display();
    q.insert();
    q.remove();
  }
}

