import java.io.*;
class Name
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name:");
        String name = br.readLine();
        System.out.println("Hello "+name+"!");
    }
}
