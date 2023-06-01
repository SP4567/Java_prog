import java.awt.*;
import java.awt.event.*;
public class mouse_key extends Frame implements MouseListener,MouseMotionListener,KeyListener
{
int x = 0;int y = 0;
String str = " ";
mouse_key()
{
addMouseListener(this);
addMouseMotionListener(this);
addKeyListener(this);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void mouseClicked(MouseEvent m)
{
x = m.getX();
y = m.getY();
Graphics g = getGraphics();
g.setColor(Color.BLUE);
g.fillOval(x,y,30,30);
}
public void paint(Graphics g)
{
g.drawString(str+" x: "+x+" y:"+y,100,100);
}
public void mouseEntered(MouseEvent m)
{
System.out.println("Mouse Entered");
}
public void mouseExcited(MouseEvent m)
{
System.out.println("Mouse Excited");
}
public void mousePressed(MouseEvent m)
{
System.out.println("Mouse Pressed");
}
public void mouseReleased(MouseEvent m)
{
System.out.println("Mouse Released");
}
public void mouseDragged(MouseEvent m)
{
System.out.println("Mouse Dragged");
}
public void mouseMoved(MouseEvent m)
{
System.out.println("Mouse Moved");
}
public void keyPressed(KeyEvent k)
{
System.out.println("Key Pressed");
}
public void keyTyped(KeyEvent k)
{
System.out.println("Key Typed");
}
public void keyReleased(KeyEvent k)
{
System.out.println("Key Released");
}
public static void main(String args[])
{
new mouse_key();
}
}

