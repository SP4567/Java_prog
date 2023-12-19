import java.util.Scanner;
class boundary
{
    int m,n,i,j;
    int sbe=0;
    int snbe=0;
    int arr[][];
    Scanner sc=new Scanner(System.in);
    boundary()
    {
        m=0;
        n=0;
    }
    void boundary(int mm,int nn)
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
        System.out.println("the original matrix is");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
    void sum_boundary_non_boundary()
    {
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
            if(i==0||i==(m-1)||j==0||j==(n-1))
            sbe=sbe+arr[i][j];
            else
            snbe=snbe+arr[i][j];
            }
        }
        System.out.println(""+sbe);
        System.out.println(""+snbe);
    }
    void main(String args[])
    {
        boundary b=new boundary();
        b.boundary(3,3);
        b.input();
        b.display();
        b.sum_boundary_non_boundary();
    }
    
}