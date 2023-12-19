import java.util.*;
public class AverageTemperature {
    int arr[];
    Scanner sc = new Scanner(System.in);
    public AverageTemperature(int size)
    {
        arr = new int[size];
    }
    public void averageTemp(int n)
    {
        int avgTemp = 0;
        int sumTemp = 0;
        System.out.println("Enter the temperatures:");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the day "+i+" temperature");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            sumTemp = sumTemp+arr[i];
            avgTemp = sumTemp/n;
        }
        System.out.println("Average temperature:"+avgTemp);
        for(int i = 0; i < n; i++)
        {
        if(avgTemp <= arr[i])
        {
            System.out.println(i+" days above average");
            break;
        }
        }
    }
    public static void main(String args[])
    {
        AverageTemperature at = new AverageTemperature(5);
        at.averageTemp(5);
    }
}
