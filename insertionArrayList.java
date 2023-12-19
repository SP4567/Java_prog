import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class insertionArrayList {
    public static void main(String args[])
    {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        /*nums.add(1);//time and space complexity: Amortized O(1)
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(6);
        nums.add(4,5);//time complexity: O[N],space complexity : Amortized O(1)
        nums.add(11);*/
        for (int num2:nums){
            //time complexity: O(N),space complexity :O(1)
            if(num2 == 0){
                System.out.println("The element is found");
                break;
            }
            else{
                System.out.println("Element not found");
                break;
            }
        }
        //time complexity: O(N),space complexity :O(1)
        int index = nums.indexOf(1);
        System.out.println("The element is found at found: "+index);
        nums.remove(3);
        System.out.println(nums);
        //System.out.println(nums);
        //System.out.println("value at index is: "+nums.get(0));//time and space complexity:O(1)
        //for(int i = 0; i <nums.size(); i++)
        /*{//time complexity: O(N),space complexity :O(1)
            int num = nums.get(i);
            System.out.println(num);
        }*/
        /*for(int num:nums)
        {//time complexity: O(n),space complexity : O(1)
            System.out.println(num);
        }*/
        /*An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
        It is called an "iterator" because "iterating" is the technical term for looping. To use an Iterator, 
        you must import it from the java.util package.*/
        /*Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext())
        {//time complexity: O(N),space complexity :O(1)
            int n = iterator.next();
            System.out.println(n);
        }*/
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("suyash");
        stringList.add("monica");
        stringList.add(2,"pandey");
        System.out.println(stringList);
    }
}
