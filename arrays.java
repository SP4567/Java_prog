import java.util.*;
class arrays
{
    int arr[][],m,n,i,j;
    Scanner sc=new Scanner(System.in);
    arrays()
    {
        m=0;
        n=0;
    }
    void assign(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[mm][nn];
    }
    void input_array()
    {
        System.out.println("enter the elements in the array \n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display_array()
    {
        System.out.println("the original matrix \n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+arr[i][j]);
            } 
            System.out.println();
        }
    }
    void transpose()
    {
        System.out.println("the transposed matrix is");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+arr[j][i]);
            }
            System.out.println();
        }
    }
    void add()
    {
        display_array();
        transpose();
        System.out.println("the sum of two matrices is");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
            arr[i][j]=arr[i][j]+arr[j][i];
            System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
    void sub()
    {
        display_array();
        transpose();
        System.out.println("difference of two matrices is");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
            if(m==n)
            {
            arr[i][j]=arr[i][j]-arr[j][i];
            System.out.print(" "+arr[i][j]);
            }
            }
            System.out.println();
        }
    }
    void main()
    {
        arrays obj=new arrays();
        obj.assign(3,3);
        obj.input_array();
        obj.display_array();
        obj.transpose();
        obj.add();
        obj.sub();
    }
}
