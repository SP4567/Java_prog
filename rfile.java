import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class rfile 
{
    public static void main(String args[])
    {
        int b;
        if(args.length!=1)
        {
            System.out.println("program accept one command line argument existing 1");
            System.exit(1);
            System.out.println("hello");
        }
        File f = new File(args[0]);
        if(f.isDirectory())
        {
            System.out.println("it is a directory");
        }
        if(f.isFile())
        {
            System.out.println("Reading contents form the file"+args[0]);
            try
            {
               FileInputStream  f1 = new FileInputStream((f));
               while((b=f1.read())!=-1)
               {
                System.out.println((char)b);
               }
               f1.close();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }
        else
        {
            System.out.println("file not present!");
        }
    }    
}
