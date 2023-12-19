import java.awt.*;
import java.awt.event.*;
public class choice 
{
choice()
{
Frame f = new Frame();
Choice c = new Choice();
c.setBounds(50,50,100,150);
c.add("python");
c.add("java");
c.add("c++");
c.add("c_lang");
f.add(c);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[])
{
new choice();
}
} 