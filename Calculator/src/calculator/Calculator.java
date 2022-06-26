package calculator; 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first_num;
	double second_num;
	double result;
	String operations;
	String answer;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 344, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//text fieldjli1
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 13, 312, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//1st Row
		
		JButton btn_per = new JButton("%");
		btn_per.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
				
			}
		});
		btn_per.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_per.setBounds(12, 70, 74, 44);
		frame.getContentPane().add(btn_per);
		
		JButton btn_brc = new JButton("x^y");
		btn_brc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "x^y";
				
			}
		});
		btn_brc.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_brc.setBounds(86, 70, 82, 44);
		frame.getContentPane().add(btn_brc);
		
		JButton btn_Ac = new JButton("AC");
		btn_Ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null); //clear the textField
			}
		});
		btn_Ac.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_Ac.setBounds(169, 70, 82, 44);
		frame.getContentPane().add(btn_Ac);
		
		JButton btn_C = new JButton("C");
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace  = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btn_C.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_C.setBounds(250, 70, 74, 44);
		frame.getContentPane().add(btn_C);
		
		
		//2nd Row
		
		JButton btn_byx = new JButton("1/x");
		btn_byx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "1/x";
				
				if(operations == "1/x")
				{
					result =  1 / first_num;
					answer = String.format("%.3f",result);
					textField.setText(answer);
				}
					
			}
		});
		btn_byx.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_byx.setBounds(12, 115, 74, 44);
		frame.getContentPane().add(btn_byx);
		
		JButton btn_sqr = new JButton("sqr");
		btn_sqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "sqr";
				
				if(operations == "sqr")
				{
					result = first_num * first_num;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btn_sqr.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_sqr.setBounds(86, 115, 82, 44);
		frame.getContentPane().add(btn_sqr);
		
		JButton btn_root = new JButton("root");
		btn_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "√x";
				
				if(operations == "√x")
				{
					result = Math.sqrt(first_num);
					answer = String.format("%.3f",result);
					textField.setText(answer);
				}
			}
		});
		btn_root.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_root.setBounds(169, 115, 82, 44);
		frame.getContentPane().add(btn_root);
		
		JButton btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first_num = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_div.setBounds(250, 115, 74, 44);
		frame.getContentPane().add(btn_div);
		
		//3rd Row
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn7.getText();
				textField.setText(Enternumber);
			}
		});
		
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(12, 160, 74, 44);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn8.getText();
				textField.setText(Enternumber);
			}
		});
		
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(86, 160, 82, 44);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn9.getText();
				textField.setText(Enternumber);
			}
		});
		
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(169, 160, 82, 44);
		frame.getContentPane().add(btn9);
		
		JButton btn_mul = new JButton("*");
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btn_mul.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_mul.setBounds(250, 160, 74, 44);
		frame.getContentPane().add(btn_mul);
		
		//4th Row
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn4.getText();
				textField.setText(Enternumber);
			}
		});
		
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(12, 206, 74, 44);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn5.getText();
				textField.setText(Enternumber);
			}
		});
		
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(86, 206, 82, 44);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn6.getText();
				textField.setText(Enternumber);
			}
		});
		
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(169, 206, 82, 44);
		frame.getContentPane().add(btn6);
		
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btn_sub.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_sub.setBounds(250, 206, 74, 44);
		frame.getContentPane().add(btn_sub);
		
		//5th Row
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn1.getText();
				textField.setText(Enternumber);
			}
		});
		
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(12, 250, 74, 44);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn2.getText();
				textField.setText(Enternumber);
			}
		});
		
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(86, 250, 82, 44);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn3.getText();
				textField.setText(Enternumber);
			}
		});
		
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(169, 250, 82, 44);
		frame.getContentPane().add(btn3);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btn_add.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_add.setBounds(250, 250, 74, 44);
		frame.getContentPane().add(btn_add);
		
		//6th Row
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn0.getText();
				textField.setText(Enternumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(12, 296, 74, 44);
		frame.getContentPane().add(btn0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn_dot.getText();
				
				//below line set the dot value which click one time only
				
				double b1 = Double.parseDouble(Enternumber);
				if( b1 >-1) {
				textField.setText(Enternumber);}
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_dot.setBounds(86, 296, 82, 44);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_pm = new JButton("+/-");
		btn_pm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double plusm = Double.parseDouble(String.valueOf(textField.getText()));
				plusm = plusm *(-1);
				textField.setText(String.valueOf(plusm));
			}
		});
		
		btn_pm.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_pm.setBounds(169, 296, 82, 44);
		frame.getContentPane().add(btn_pm);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				double i,result=1;
				
				second_num = Double.parseDouble(textField.getText());
				if(operations == "+")
				{
					result = first_num + second_num;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				
				else if (operations == "-")
				{
					result = first_num - second_num;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				
				else if (operations == "*")
				{
					result = first_num * second_num;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				
				else if (operations == "/")
				{
					result = first_num / second_num;
					answer = String.format("%.3f",result);
					textField.setText(answer);
				}
				
				else if(operations=="%")
				{
						result =(first_num*second_num)/100;
						answer = String.format("%.2f",result);
						textField.setText(answer);
				}
				
				else if(operations == "x^y")
				{
					for( i = 1; i<=second_num;i++)
					{
						result = result*first_num;
					
						answer = String.format("%.3f",result);
						textField.setText(answer);
					}
					
				}

			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_equal.setBounds(250, 296, 74, 44);
		frame.getContentPane().add(btn_equal);
   }
}
