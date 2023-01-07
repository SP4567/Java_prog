import java.util.Scanner;
class palindrome
{
    int arr[][],i,j,m,n;
    Scanner sc=new Scanner(System.in);
    palindrome(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[mm][nn];
    }
    void input()
    {
        System.out.println("enter the elements in the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        System.out.println("original matrix is");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
    boolean isPalindrome(int t)
    {
        int s=t,r=0;
        while(s>0)
        {
            int digit=s%10;
            r=(r*10)+digit;
            t=t/10;
        }
        if(t==r)
        return true;
        else 
        return false;
    }
    void arrpalindrome()
    {
        boolean c=isPalindrome(arr[i][j]);
        if(c==true)
        System.out.println("is palindrome");
        else
        System.out.println("is not palindrome");
    }
    void main()
    {
        palindrome p=new palindrome(3,3);
        p.input();
        p.display();
        p.isPalindrome(121);
        p.arrpalindrome();
    }
}