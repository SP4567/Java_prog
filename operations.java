import java.awt.*;
import java.awt.event.*;
class operations extends Frame implements ActionListener
{
TextField tf;
operations(){
tf = new TextFchoideield();
tf.setBounds(60,50,170,20);
Button b = new Button("Click me");
b.setBounds(100,120,80,30);
b.addActionListener(this);
add(b);
add(tf);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("Welcome");
}
public static void main(String args[])
{
new operations();
}
}