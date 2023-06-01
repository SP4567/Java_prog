import java.util.*;
class stacks2
{
Scanner sc = new Scanner(System.in);
int top;
int capacity;
int[] stk = new int[10];
stacks2(int cap)
{
top = 0;
capacity = cap;
}
void display()
{
System.out.println("enter the elements in the stack>>");
for(int i=0;i<10;i++)
{
stk[i] = sc.nextInt();
System.out.println(stk[i]);
}
}
void push(int value)
{
if(top < capacity)
{
stk[top++]=value;
}
else
{
System.out.println("Stack overflow!");
}
}
void pop()
{
if(top == 0)
{
System.out.println("-9999\n Stack underflow!");
}
else
{
System.out.println(--top+" stack empty");
System.out.println("Values are deleted from the stack!");
}
}
public static void main(String args[])
{
stacks2 s = new stacks2(10);
s.display();
s.push(20);
s.pop();
}
}