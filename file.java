import java.io.FileReader;
import java.io.*;
class file
{
    public static void main(String args[])
    {
        try{
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output.txt");
            String str =" ";
            int i;
            while((i = fr.read())!=-1)
            {
                str += (char)i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
            System.out.println("file reading and writing both done");
        }
        catch(Exception e)
        {
           System.out.println("these are ioexception");
        }
    }
}
