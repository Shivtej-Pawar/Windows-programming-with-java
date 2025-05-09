import java.awt.*;
import java.awt.event.*;
public class Frm4 extends Frame implements WindowListener
{
    Frm4()
    {
        super("Window listener");
        addWindowListener(this);
        setSize(400,400);
        setVisible(true);
    }

    public void windowOpened(WindowEvent e)
    {
        System.out.println("Opened");
    }

    public void windowClosed(WindowEvent e)
    {
        System.out.println("closed");
    }
    
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
  
    public void windowActivated(WindowEvent e)
    {
         System.out.println("Activated");
    }
  
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Deactivated");
    }

    public void windowIconified(WindowEvent e)
    {
        System.out.println("Iconified");
    }

    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Deiconified");
    }

    public static void main(String[] args) {
        Frm4 a=new Frm4();
    }


}
