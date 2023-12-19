import java.util.*;
class name_strings
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        String names[]={"Nissan", "Maruti", "Renault", "Tata"},temp;
        System.out.println("enter the capacity");
        int n = sc.nextInt();
        System.out.println("set of] names is");
        for(i = 0;i < n;i++)
        {
            System.out.println(names[i]);
        }
        for(i = 0;i < n;i++)
        {
            for(j = i + 1;j < n;j++)
            {
                if((names[i].compareTo(names[j])) > 0)
                {
                   temp = names[i];
                   names[i] = names[j];
                   names[j] = temp;
                }
            }
        }
        System.out.println("The names in the alphabetical order are:");
        for(i = 0;i < n;i++)
        {
            System.out.println(names[i]);
        }
    }
}

