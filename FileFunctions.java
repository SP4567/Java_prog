import java.io.File;
import java.util.*;
public class FileFunctions
{
    public static String getFileExtensions(String path)
    {
        String fName = new File(path).getName();
        int dotIndex=path.lastIndexOf('.');
        return (dotIndex == -1)?"":path.substring(dotIndex + 1);    
    }
    public static void main(String args[])
    {
        System.out.println("please enter the full path of the file");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        File obj = new File(path);
        if(obj.exists()){
            System.out.println("Name of the file:"+obj.getName());
            System.out.println("File can read:"+obj.canRead());
            System.out.println("File can Write:"+obj.canWrite());
            System.out.println("Size of the file:"+obj.length()+"bytes");
            System.out.println("Type of File:"+getFileExtensions(path));
        }
        else{
            System.out.println("file does not exists!!");
        }
    }
}