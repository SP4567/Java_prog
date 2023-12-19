import java.util.*;
class Nissan_suzuki
{
    String make;
    String model;
    int year;
    Nissan_suzuki(String make,String model,int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void dislay()
    {
        System.out.println(make+" "+model+" "+year);
    }
    public static void main(String args[])
    {
        Nissan_suzuki ns = new Nissan_suzuki("Nissan","Magnite", 2022);
        Nissan_suzuki ns2 = new Nissan_suzuki("Maruti_Suzuki", "Alto-LXI", 2006);
        ns.dislay();
        ns2.dislay();
    }
}