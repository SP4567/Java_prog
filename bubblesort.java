import java.util.Scanner;
class bubblesort
{
    int arr[],i,j,n,temp;
    Scanner sc=new Scanner(System.in);
    bubblesort()
    {
     i=0;
     arr=new int[0];
    }
    void input()
    {
        System.out.println("enter the elements in the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("the original array is");
        for(i=0;i<n;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
    void bubble()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<i-1-n;j++)
            {
                if(arr[j]<arr[j+1])
                {
                   temp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println("the sorted array is:");
        for(i=0;i<n;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
    public static void main(String[] args)
    {
        bubblesort obj=new bubblesort();
        obj.input();
        obj.display();
        obj.bubble();
    }
}