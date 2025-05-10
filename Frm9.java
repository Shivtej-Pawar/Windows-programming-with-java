import java.awt.*;
import java.awt.event.*;
public class Frm9 extends Frame implements ActionListener,FocusListener{
       Label l1,l2,l3;
       TextField t1,t2,t3;
       Button ba,bs,bm,bd;
       int res,v1,v2;
       Panel p,q;
       char opr;
       Frm9()
       {
          super("calculator");
          l1=new Label("value 1");
          l2=new Label("Value 2");
          l3=new Label("result");
          
          t1=new TextField(10);
          t2=new TextField(10);
          t3=new TextField(10);
 
           t3.setEditable(false);
           t1.addFocusListener(this);
           t2.addFocusListener(this);

           p=new Panel();
           p.setLayout(new GridLayout(3,2,5,5));
           p.add(l1);
           p.add(t1);
           p.add(l2);
           p.add(t2);
           p.add(l3);
           p.add(t3);
          
           
           ba=new Button("+");
           bs=new Button("-");
           bm=new Button("*");
           bd=new Button("/");
  
           ba.addActionListener(this);
           bs.addActionListener(this);
           bm.addActionListener(this);
           bd.addActionListener(this);


           q=new Panel();
           q.setLayout(new GridLayout(1,4,5,5));
           q.add(ba);
           q.add(bs);
           q.add(bm);
           q.add(bd);
           
           
           add(p,BorderLayout.CENTER);
           add(q,BorderLayout.SOUTH);

          
           addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e)
             {
                System.exit(0);
             }
           });
 
           setSize(400,400);
           setVisible(true);
       }

       public void focusGained(FocusEvent e)
       {
         TextField t=(TextField)e.getSource();
         if(t==t1)
         {
            ba.setEnabled(false);
            bs.setEnabled(false);
            bm.setEnabled(false);
            bd.setEnabled(false);
         }
       }
    
       public void focusLost(FocusEvent e)
       {
        
          TextField t=(TextField)e.getSource();
          if(t==t1)
          {
            try
            {
                v1=Integer.parseInt(t1.getText());
            }
            catch(Exception e1){
                t1.requestFocus();
                return;
            }
         }
        if(t==t2)
        {
            try
            {
                v2=Integer.parseInt(t2.getText());
            }
            catch(Exception e1)
            {
            t2.requestFocus();
           return;
            }
        }
         ba.setEnabled(true);
         bs.setEnabled(true);
         bm.setEnabled(true);
         bd.setEnabled(true);
      }

      void comp()
      {
        switch(opr)
        {
            case '+':
                 res=v1+v2;
                 break;     
            case '-':
                 res=v1-v2;
                 break;     
            case '*':
                 res=v1*v2;
                break;     
            case '/':
                 res=v1/v2;
        }
        t3.setText(""+res);
      }

     public void actionPerformed(ActionEvent e)
     {
         opr=(e.getActionCommand()).charAt(0);
         comp();
         t1.requestFocus();
    }
    public static void main(String[] args) {
        Frm9 a=new Frm9();
    }


}


