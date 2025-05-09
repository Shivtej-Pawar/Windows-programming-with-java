import java.awt.*;
import java.awt.event.*;
import mpkg.Util;
class Frm5 extends Frame implements WindowListener,ActionListener{

    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
     Frm5() 
     {
         l1=new Label("No:");
         l2=new Label("Name:");
         l3=new Label("City:");

        t1=new TextField(10);
        t2=new TextField(30);
        t3=new TextField(10);

        b1=new Button("ok");
        b2=new Button("clear");

       b1.addActionListener(this);  
       b2.addActionListener(this);  
       setLayout(new GridLayout(4,2,5,5));

       add(l1);
       add(t1);
       add(l2);
       add(t2);
       add(l3);
       add(t3);
       add(b1);
       add(b2);
       
       addWindowListener(this);
       setSize(400,400);
       setVisible(true);
     }
     public void windowOpened(WindowEvent e){}
     public void windowClosed(WindowEvent e){}
     public void windowClosing(WindowEvent e){
         System.exit(0);
        }
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}

    public void actionPerformed(ActionEvent e)  
    {
        Button b=(Button)e.getSource();
        if(b==b1)
        {
            String s="Roll No:"+t1.getText()+"\n Name:"+t2.getText()+"\n City:"+t3.getText();
            Util.display(s);
        }
        t3.setText("");
        t1.setText("");
        t2.setText("");
    }
  public static void main(String[] args) {
    Frm5 a=new Frm5();
  }
}
