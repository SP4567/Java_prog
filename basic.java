//basic synatax to write a java program
import java.util.Arrays;
class basic
{
    public static void main(String args[])
    { 
        int[] intArray; 
        intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        System.out.println(Arrays.toString(intArray));
        String sArray[] = {"a","b","c"};
        System.out.println(Arrays.toString(sArray));
    }
}