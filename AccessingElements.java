public class AccessingElements {
    int arr[] = null;
    public AccessingElements(int n)
    {
        arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valuToBeInserted)
    {
        try{
        if(arr[location] == Integer.MIN_VALUE)
        {
        arr[location] = valuToBeInserted;
        System.err.println("Successfully inserted");
        }
        else
        {
            System.out.println("This cell is already occupied");
        }
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
    System.out.println("Invalid index to access array!");
    }
}  
public static void main(String args[])
{
    AccessingElements sda = new AccessingElements(10);
    sda.insert(0, 0);
    sda.insert(1, 10);
    sda.insert(2, 20);
    sda.insert(1, 30);
    sda.insert(12, 120);
    int firstElement = sda.arr[2];
    System.out.println(firstElement);
}
}
