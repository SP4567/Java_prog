import java.io.IOException;
import java.util.*;
class exceptions
{
public static void main(String args[])throws Marks_out_Of_Bound
{
Scanner sc=new Scanner(System.in);
System.out.println("enter marks of student out of 100: ");
int marks = sc.nextInt();
if(marks < 100)
System.out.println(marks);
}
}
