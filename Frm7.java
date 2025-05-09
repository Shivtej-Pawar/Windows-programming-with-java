import java.awt.*;
import java.awt.event.*;
import mpkg.Util;
public class Frm7 extends Frame implements ActionListener {
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    int no;
    String nm;
    double mrk;
    Frm7()
    {
        super();
         l1=new Label("Roll No:");
         l2=new Label("name:");
         l3=new Label("Marks:");

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

         addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
         });


         setSize(400,400);
         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b1)
        {
           try
           {
             no=Integer.parseInt(t1.getText());
           }
           catch(Exception e1)
           {
              t1.requestFocus();
              return;
           }
           if(no<0)
           {
             t1.requestFocus();
             return;
           }
           nm=t2.getText();
           try
           {
             mrk=Double.parseDouble(t3.getText());
           } 
           catch(Exception e1){
             t3.requestFocus();
             return;
           }
          
           if(mrk<0.0 || mrk>10.0)
           {
              t3.requestFocus();
              return;
           }
           String s="No:"+no+"\n Name:"+nm+"\n Marks:"+mrk;
           Util.display(s);
        }
           t1.setText("");
           t2.setText("");
           t3.setText("");

           t1.requestFocus();
    }

    public static void main(String[] args) {
        Frm7 a=new Frm7();
    }
    

}
