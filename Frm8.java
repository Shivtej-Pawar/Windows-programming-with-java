import java.awt.*;
import java.awt.event.*;
public class Frm8 extends Frame implements ActionListener,FocusListener {
    int no;
    String nm;
    double mrk;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
     Frm8()
     {
        super("Student");
        l1=new Label("No:");
        l2=new Label("Name");
        l3=new Label("Marks");

        t1=new TextField(10);
        t2=new TextField(30);
        t3=new TextField(10);
        
        t1.addFocusListener(this);
        t3.addFocusListener(this);

        b1=new Button("ok");
        b2=new Button("clear");
        
        setLayout(new GridLayout(4,2,5,5));
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);

        addWindowListener(new WindowAdapter(){
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
            catch(Exception e1){
                t1.requestFocus();
                return;
            }
            if(no<=0)
            {
                t1.requestFocus();
                return;
            }
            nm=t2.getText();
            try
            {
                mrk=Double.parseDouble(t3.getText());
            }
            catch(Exception e1)
            {
                t3.requestFocus();
                return;
            }
            if(mrk<0.0 || mrk>10.0)
            {
                t3.requestFocus();
                return;
            }
        }
        t3.setText("");
        t2.setText("");
        t1.setText("");
        t1.requestFocus();
}

  



     public void focusGained(FocusEvent e)
     {
        TextField t=(TextField)e.getSource();
        if(t==t1)
          b1.setEnabled(false);
     }

     public void focusLost(FocusEvent e)
     {
        TextField t=(TextField)e.getSource();
        if(t==t1)
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
        }
        if(t==t3)
        {
            try
            {
                mrk=Double.parseDouble(t3.getText());
            }
            catch(Exception e1)
            {
                t3.requestFocus();
                return;
            }
            b1.setEnabled(true);
        }
     }


     public static void main(String[] args) {
         Frm8 a=new Frm8();
     }

     
}
