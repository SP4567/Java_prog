public class AccessingTwoDimensionalArray {
    int m,n;
    int arr[][];
    public AccessingTwoDimensionalArray(int r,int c)
    {
      m = r;
      n = c;
      arr = new int[r][c];
        for(int i = 0; i < m; i++)
        {
        for(int j = 0; j < n; j++)
          {
            arr[i][j] = Integer.MIN_VALUE;
          }
        }
    }
    public void insert(int valueToBeInserted, int i, int j )
    {
        try
        {
        if(arr[i][j] == Integer.MIN_VALUE)
        {
            arr[i][j] = valueToBeInserted;
            System.out.println("Value inserted!");
        }
        else
        {
            System.out.println("Value not inserted!");
        }
    }catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }
    } 
    public void accessElements(int r, int c)
    {
        try
        {
        System.out.println("Row:"+r+"\nCol:"+c);
        System.out.println("\nValue found at the specified location is: "+arr[r][c]+" ");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
    public void array2DTraversal(int m,int n)
    {
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void searchElement(int valueToBeSearched)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i][j] == valueToBeSearched)
                {
                    System.out.println("value found "+valueToBeSearched+" at location "+i+j);
                }
            }
        }
    }
    public void valueDelete(int i, int j)
    {
        try{
            System.out.println("Value successfully deleted : "+arr[i][j]);
            arr[i][j] = Integer.MIN_VALUE;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        AccessingTwoDimensionalArray atda = new AccessingTwoDimensionalArray(2, 2);
        atda.insert(1, 0, 0);
        atda.insert(2, 0, 1);
        atda.insert(3, 1, 0);
        atda.insert(4, 1, 1);
        atda.accessElements(1, 0);
        atda.array2DTraversal(2, 2); 
        atda.searchElement(4);
        atda.valueDelete(1, 0);
    }
}