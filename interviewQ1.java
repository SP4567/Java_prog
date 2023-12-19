import java.util.*;
public class interviewQ1 {
        Scanner sc = new Scanner(System.in);
        public int arr[];
        public int m;
        public interviewQ1(int l)
        {
            m = l;
            arr = new int[l];
        }
        void sumCal()
        {
            System.out.println("Enter the elements in the array:");
            for(int i = 0; i < m; i++)
            {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int product = 1;
            for(int i = 0; i < m; i++)
            {
                sum = sum+arr[i];
                product = product * arr[i];
            }
            System.out.println("Sum of all the elements of the given array is: "+sum);
            System.out.println(" Product of all the elements of the given array is: "+product);
        } 
    public static void main(String args[])
    {
        interviewQ1 iq = new interviewQ1(10);
        iq.sumCal();
    }  
}
