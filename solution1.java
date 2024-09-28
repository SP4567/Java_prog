
import java.util.*;

class solution1
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = OperationsBinaryStrings(str);
        System.err.println(res);
    }
    public static int OperationsBinaryStrings(String str)
    {
        if(str == null)
        {
            return 0;
        }
        int result = str.charAt(0) - '0';
        for(int i = 1; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            switch(ch)
            {
                case 'A': result = result & (ch - '0'); return result;
                case 'B': result = result | (ch - '0'); return result;
                case 'C': result = result ^ (ch - '0'); return result;
                default: return result;
            }
        }
        return result;
    }
}