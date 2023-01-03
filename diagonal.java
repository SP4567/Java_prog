import java.util.Scanner;
class diagonal
{
    int arr[][],i,j,m,n;
    int md=0,amd=0,bmd=0,sd=0,asd=0,bsd=0;
    Scanner sc=new Scanner(System.in);
    diagonal(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[mm][nn];
    }
    void get_data()
    {
        System.out.println("enter the elements in the matix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void put_data()
    {
       System.out.println("the original matix is");
       for(i=0;i<m;i++)
       {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
       }  
    }
    void calculations()
    {
       for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                md=md+arr[i][j];
                if(i<j)
                amd=amd+arr[i][j];
                if(i>j)
                bmd=bmd+arr[i][j];
                if((i+j)==n-1)
                sd=sd+arr[i][j];
                if((i+j)<n-1)
                asd=asd+arr[i][j];
                if((i+j)>n-1)
                bsd=bsd+arr[i][j];
            }
        }
        System.out.println(" "+md);
        System.out.println(" "+amd);
        System.out.println(" "+bmd);
        System.out.println(" "+sd);
        System.out.println(" "+asd);
        System.out.println(" "+bsd);
    }
    void main()
    {
        diagonal d=new diagonal(3,3);
        d.get_data();
        d.put_data();
        d.calculations();
    }
}