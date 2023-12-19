import java.util.ArrayList;
import java.util.Arrays;
public class arrayList {
    public static void main(String args[])
    {
    ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
    System.out.println(numbers);
    }
}
//time complexity when size is 1: O(1)
//space complexity when size is 1: O(1)
//time complexity when size is 10: O(1)
//space complexity when size is 1: O(n)