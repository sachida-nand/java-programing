import javax.swing.*;
import java.awt.event.*;
public class SwingE extends JFrame{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1;

	public SwingE(){}
	public SwingE(String s)
	{ super (s); }
   
    public void setComponents()
    {
    	l1=new JLabel("Addition of two Number");
    	l2 = new JLabel("Enter 1st number");
    	l3 = new JLabel("Enter 2nd number");
    	l4 = new JLabel();
    	t1 = new JTextField();
    	t2 = new JTextField();
    	b1 = new JButton("Add");

    	setLayout(null);
    	l1.setBounds(80,50,150,20);
    	l2.setBounds(50,80,100,20);
        t1.setBounds(160,80,100,20);
        l3.setBounds(50,110,110,20);
        t2.setBounds(160,110,100,20);
        b1.setBounds(80,150,100,20);
        l4.setBounds(50,200,100,20);
        b1.addActionListener(new Handler());

    	add(l1);
    	add(l2);
    	add(l3);
    	add(l4);
    	add(t1);
    	add(t2);
    	add(b1);
    }
    class Handler implements ActionListener {
    	public void actionPerformed(ActionEvent e){
    		int a= Integer.parseInt(t1.getText());
    		int b=Integer.parseInt(t2.getText());
    		int s=a+b;
    		l4.setText("Result is "+s);
    	}
    }
	public static void main(String args[])
	{
	SwingE js = new SwingE("Swing Example");
	js.setComponents();
	js.setSize(400,300);
	js.setVisible(true);
	js.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}