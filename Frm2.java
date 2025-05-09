import java.awt.*;
import java.awt.event.*;
public class Frm2 extends Frame{
    Frm2(String title)
    {
        super(title);
        setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)Math.random()*255));
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Frm2("Window");
    }
}
