import java.awt.*;
import java.awt.event.*;
public class mouse_key extends Frame implements MouseListener, MouseMotionListener,KeyListener
{
    int x = 0,y = 0;
    String str = "";
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
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(x,y,30,30);
    }
    public void paint(Graphics g)
    {
        g.drawString(str+" x:"+x+" y:"+y,100,100);
    }    
    public void mouseEntered(MouseEvent m)
    {
        System.out.println("Mouse Entered");
    }
    public void mouseExited(MouseEvent m)
    {
        System.out.println("Mouse Exited");
    }
    public void mousePressed(MouseEvent m)
    {
        setBackground(Color.yellow);
    }
    public void mouseReleased(MouseEvent m)
    {
        setBackground(Color.blue);
    }
    public void mouseMoved(MouseEvent m)
    {
        str = "mouse moved";
        repaint();
    }
    public void mouseDragged(MouseEvent m)
    {
        str = "mouse dragged";
        repaint();
    }
    public void keyPressed(KeyEvent k)
    {
        System.out.println("key pressed");
    }
    public void keyReleased(KeyEvent k)
    {
        System.out.println("key released");
    }
    public void keyTyped(KeyEvent k)
    {
        System.out.println("key typed");
    }
    public static void main(String args[])
    {
       new mouse_key();
    }
}
