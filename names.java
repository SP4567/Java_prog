import java.util.*;
class names
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str[],temp;int i,j;
System.out.println("enter the elements in the array:");
for(i=0;i<5;i++)
{
str[i]=sc.next();
}
System.out.println("the array of strings is:");
for(i=0;i<5;i++)
{
System.out.println(" "+str[i]);
}
for(i=0;i<5;i++)
{
for(j=0;j<4-i;j++)
{
String s = str[j];
String t = str[j+1];
if(s.compareTo(t))
{
temp=str[j];
str[j]=str[j+1];
str[j+1]=temp;
}
}
}
System.out.println("sorted array is:");
for(i=0;i<5;i++)
{
System.out.println(" "+str[i]);
}
}
}
