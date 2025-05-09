import java.awt.*;
import java.awt.event.*;
import mpkg.Util;
class Frm3 extends Frame implements ActionListener{
     Label l1,l2,l3;
     TextField t1,t2,t3;
     Button b1,b2;
     Frm3()
     {
        super("Student");
        l1=new Label("Roll No:");
        l2=new Label("Name:");
        l3=new Label("Marks:");

         t1=new TextField(10);
         t2=new TextField(30);
         t3=new TextField(10);

         b1=new Button("ok");
         b2=new Button("Exit");
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
         setSize(400,400);
         setVisible(true);
     }  

     public void actionPerformed(ActionEvent e)
     {
        Button b=(Button)e.getSource();
        if(b==b2)
           System.exit(0);
        else
        {
            String s="Roll No:"+t1.getText()+"\n Name:"+t2.getText()+"\n Marks:"+t3.getText();
           Util.display(s);
           t1.requestFocus();
        }
     }

     public static void main(String[] args) {
        Frm3 a=new Frm3();
     }

}