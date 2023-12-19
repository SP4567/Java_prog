import java.util.*;
class marks_out_of_bounds
{
    public static void main(String args[])
    {
       int arr[] = new int[5];
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the marks of the students in the array");
       for(int i=0;i<5;i++)
       {
        arr[i] = sc.nextInt();
       }
       for(int i=0;i<5;i++) 
       {
        if(arr[i]>100)
        {
            System.out.println("Marks Out Of Bounds at position "+i);
        }
        System.out.println(arr[i]);
       }
    }
}