import java.io.*;
class table_buffer
{
public static void main(String args[])throws IOException
{
DataInputStream dis = new DataInputStream(System.in);
String str = dis.readLine();
int i=Integer.parseInt(str);
for(i=50;i>=0;i=i-2)
{
System.out.println(" "+i);
}
}
}




