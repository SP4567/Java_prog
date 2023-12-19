import java.util.*;
public class interviewQ6 
{
    Scanner sc = new Scanner(System.in);
    public int arr[];
    public int m;
    public interviewQ6(int l)
    {
        m = l;
        arr = new int[l];
    }    
    void reverse()
    {
        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < m; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in the reverse order are: ");        
        for(int i = 0; i < m; i++)
        {
        for(int j = m-1; j >= 0; j--)
        {
            System.out.print(" "+arr[j]);
        }
        break;
    }
}
    public static void main(String args[])
    {
        interviewQ6 i6 = new interviewQ6(4);
        i6.reverse();
    }
}
//time complexity: O(N)
