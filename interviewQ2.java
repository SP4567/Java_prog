import java.util.*;
public class interviewQ2 {
    public int arr[];
    public int m;
    Scanner sc = new Scanner(System.in);
    public interviewQ2(int l)
    {
        m = l;
        arr = new int[l];
    }
    public static void main(String args[])
    {
        interviewQ2 i2 = new interviewQ2(4);
        i2.printPair();
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
            for(int j = 0; j < m; j++)
            {
            System.out.println(arr[i]+""+arr[j]);
            }
        }
    }
}
//Time complexity O(N^2).