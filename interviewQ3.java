import java.util.*;
public class interviewQ3 {
    public int arr[];
    public int m;
    Scanner sc = new Scanner(System.in);
    public interviewQ3(int l)
    {
        m = l;
        arr = new int[l];
    }
    public static void main(String args[])
    {
        interviewQ3 i3 = new interviewQ3(4);
        i3.printPair();
    }
    void printPair()
    {
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < m; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < m;i++)
        {
            for(int j = i+1; j < m; j++)
            {
            System.out.println(arr[i]+""+arr[j]);
            }
        }
    }
}
//Time complexity O(N^2).
/*two methods for finding out the average time complexity
1. count the number of iterations
2. average work
