

import java.util.*;
class temperature_convertor
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter temperature in fahrenheit");
int temp_fah=sc.nextInt();
int celsius=((temp_fah-32)*5)/9;
System.out.println("temperature in degree celsius is="+celsius);
}
}