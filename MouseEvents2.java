import java.awt.*;
import java.awt.event.*;
import java.io.*;
class MouseEvents2 extends Frame implements MouseListener,MouseMotionListener,KeyListener
{
    Label l;
    MouseEvents2(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        l = new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent m)
    {
        l.setText("Mouse clicked");
    }
    public void mouseEntered(MouseEvent m)
    {
        l.setText("Mouse Entered");
    }
    public void mousePressed(MouseEvent m)
    {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent m)
    {
        l.setText("Mouse Released");
    }
    public void mouseExcited(MouseEvent m)
    {
        l.setText("Mouse Exited");
    }
    public void mouseDragged(MouseEvent m)
    {
        Graphics g = getGraphics();
        int x = m.getX();
        int y = m.getY();
        g.fillOval(x, y, 31, 10);
        l.setText("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent m)
    {
        Graphics gh = getGraphics();
        int s = m.getX();
        int p = m.getY();
        gh.fillOval(s, p, 10, 10);
        gh.setText("Mouse Moved");
    }
    public void keyTyped(KeyEvent k)
    {
        l.setText("Key Typed");
    }
    public void keyPressed(KeyEvent k)
    {
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent k)
    {
        l.setText("Key released");
    }
    public static void main(String args[])
    {
        new MouseEvents2();
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }
}