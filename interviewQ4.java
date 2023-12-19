import java.util.*;
public class interviewQ4 {
    public int arr[],arr1[];
    public int m,n;
    Scanner sc = new Scanner(System.in);
    public interviewQ4(int l, int r)
    {
        m = l;
        n = r;
        arr = new int[l];
        arr1 = new int[r];
    }
    void func()
    {
        System.out.println("Enter the elements in the array:");
        for(int i = 0; i < m; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in the next array:");
        for(int j = 0; j < n; j++)
        {
            arr1[j] = sc.nextInt();
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[i] < arr1[j])
                {
                    System.out.print("{"+arr[i]+""+arr1[j]+"}");
                }
            }
        }
    }
    public static void main(String args[])
    {
        interviewQ4 i4 = new interviewQ4(4,4);
        i4.func();
    }
}
//time complexity: O(MN)