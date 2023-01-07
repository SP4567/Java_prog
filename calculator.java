import java.util.Scanner;
class calculator
{ 
    int arr1[][],arr2[][],arr3[][],arr4[][],arr5[][],arr6[][],arr7[][],m,n;
    Scanner sc=new Scanner(System.in);
    calculator(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr1=new int[mm][nn];
        arr2=new int[mm][nn];
        arr3=new int[mm][nn];
        arr4=new int[mm][nn];
        arr5=new int[mm][nn];
        arr6=new int[mm][nn];
        arr7=new int[mm][nn];
    }
    void input()
    {
        System.out.println("enter the elements in the matrix one");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
    }
    void input2()
    {
        System.out.println("enter the elements in the matrix two");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
    }
    void disp1()
    {
        System.out.println("original matrix is");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(""+arr1[i][j]);
            }
            System.out.println();
        }
    }
    void disp2()
    {
        System.out.println("original matrix is");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(""+arr2[i][j]);
            }
            System.out.println();
        }
    } 
    void calc(int choice)
    {
        while(choice!=6)
        {
            System.out.println("1.add\n2.subtract\n3.multiply\n4.divide\n5.modulus\n6.exit");
            System.out.println("enter your choice");
            choice=sc.nextInt();
            switch(choice)
            {
            case 1:
            System.out.println("sum of two matrices is");    
            for(int i=0;i<m;i++)
            {
            for(int j=0;j<n;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(" "+arr3[i][j]);    
            }
            System.out.println();
            }
            break;
            case 2:
            System.out.println("difference of two matrices is");    
            for(int i=0;i<m;i++)
            {
            for(int j=0;j<n;j++)
            {
                arr4[i][j]=arr1[i][j]-arr2[i][j];
                System.out.print(" "+arr4[i][j]);    
            }
            System.out.println();
            }
            break;
            case 3:
            System.out.println("product of two matrices is");    
            for(int i=0;i<m;i++)
            {
            for(int j=0;j<n;j++)
            {
                arr5[i][j]=arr1[i][j]*arr2[i][j];
                System.out.print(" "+arr5[i][j]);    
            }
            System.out.println();
            }
            break;
            case 4:
            System.out.println("quotient of two matrices is");    
            for(int i=0;i<m;i++)
            {
            for(int j=0;j<n;j++)
            {
                arr6[i][j]=arr1[i][j]/arr2[i][j];
                System.out.print(" "+arr6[i][j]);    
            }
            System.out.println();
            }
            break; 
            case 5:
            System.out.println("remainder of two matrices is");    
            for(int i=0;i<m;i++)
            {
            for(int j=0;j<n;j++)
            {
                arr7[i][j]=arr1[i][j]%arr2[i][j];
                System.out.print(" "+arr7[i][j]);    
            }
            System.out.println();
            }
            break;
            default:System.out.println("Invalid choice!!");
            break;
            }
        }
    }
    void main()
    {
        calculator c=new calculator(3,3);
        c.input();
        c.input2();
        c.disp1();
        c.disp2();
        c.calc(1);
    }
}