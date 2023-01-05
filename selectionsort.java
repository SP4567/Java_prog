import java.util.Scanner;
class selectionsort
{
    int arr[],i,j,temp;
    Scanner sc=new Scanner(System.in);
    selectionsort()
    {
     arr=new int[10];
    }
    void input()
    {
        System.out.println("enter the elements in the array");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("the original array is");
        for(i=0;i<10;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    void selection()
    {
        int p;
        for(i=0;i<10;i++)
        {
            p=i;
            for(j=i+1;j<10;j++)
            {
            if(arr[i]>arr[j])
            p=j;
            }
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println("the sorted array is:");
        for(i=0;i<10;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    void main()
    {
       selectionsort obj=new selectionsort();
        obj.input();
        obj.display();
        obj.selection();
    }
}