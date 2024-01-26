import java.util.*;
class stacks 
{
   int stk[]=new int[20];
   int top;
   int capacity;
   stacks(int cap)
   {
    top = 0;
    capacity = cap;
   }    
   void push()
   {
   Scanner sc =new  Scanner(System.in);
   int value = sc.nextInt();
    if(top < capacity)
    {
       stk[top++]=value; 
    }
    else
    {
        System.out.println("stack  overflow!");
    }
   }
   void pop()
   {
    if(top==0)
    {
        System.out.println("stack underflow!");
        System.out.println("-9999");
    }
    else{
        top--;
        System.out.println("value deleted!"+stk[top]);
    }
   }
   void display()
   {
   if(top!=0)
   {
    System.out.println("enter the elements in the stack!");
    for(int i=top;i>=0;i--)
    {
        System.out.println(" "+stk[i]);
    }
 }
  else
{
System.out.println("values are there in the stack!");
   }
}
   public static void main(String args[])
   {
    stacks s = new stacks(10);
    s.push();
    s.pop();
    s.display();
   }
}
