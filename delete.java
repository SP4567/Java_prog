import java.util.Scanner;
class delete
{
int Arr[];
int n;
int x;
{
int Delete(int nn)
{
n=nn;
    }
    return n;
}
    
    void input()
    {
        Scanner sc=new Scanner (System.in);
        for(x=0;x<n;x++)
        System.out.println("enter element for array");
        Arr[x]=sc.nextInt();
    }
    
    void display()
    {
        for(x=0;x<n;x++)
        System.out.println("array is"+Arr[x]);
    }
    
    void delete(int pos)
    {
        for( x=pos;x<n-1;x++)
        {
            Arr[x]=Arr[x+1];
        }
        n--;
    }
    
    void deleteValues(int val)
    {
        for( x=0;x<n;x++)
        {
            if(Arr[x]==val)
            delete(x);
            x--;
        }
    }
    
    void pack()
    {
        for( x=0;x<n-1;x++)
        {
            delete(x);
            deleteValues(x);
        }
    }
void main()
{
delete obj=new delete();
obj.input();
obj.display();
obj.pack();
    }
}
           
        
        
        
       