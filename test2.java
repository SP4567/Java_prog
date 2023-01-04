import java.util.Scanner;
class multilevelinheritance
{
    String name;
    String clgName;
    int rollNo;
    Scanner sc=new Scanner(System.in);
    void get_data()
    {
        System.out.println("enter Name:");
        name=sc.next();
        System.out.println("enter College:");
        clgName=sc.next();
        System.out.println("enter your Roll_number:");
        rollNo=sc.nextInt();
    }
}
class inherit1 extends multilevelinheritance
{
    int m1,m2,m3,m4,m5,m6;
    Scanner sc=new Scanner(System.in);
    void marks()
    {
    System.out.println("enter the marks of a student in six subjects:");
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
    m4=sc.nextInt();
    m5=sc.nextInt();
    m6=sc.nextInt();
    }
}
class inherit2 extends inherit1
{
    int total_marks;double sgpa;
    void totalMarks()
    {
        total_marks=m1+m2+m3+m4+m5+m6;
        sgpa=((total_marks*100)/600)/9.5;
        System.out.println("total_marks:"+total_marks);
         System.out.println("sgpa:"+sgpa);
    }
}
public class test2
{
    public static void main()
    {
        inherit2 i2=new inherit2();
        i2.get_data();
        i2.marks();
        i2.totalMarks();
    }
}