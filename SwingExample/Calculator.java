import javax.swing.*;
import java.awt.*;
class MyCalculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);

	public MyCalculator(){}
	public MyCalculator(String s)
	{ super (s); }
   

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	
	JButton addition = new JButton();
	JButton substraction = new JButton();
	JButton multiplication = new JButton();
	JButton division = new JButton();
	JButton percentage = new JButton();
	JButton squre = new JButton();
	
	double num1, num2, result;
	int add=0; int sub = 0; int div = 0; int mul=0; int per=0; int sqr=0;
	
	public MyCalculator() {
		frame.setSize(400,500);
		frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setTitle("Calculator");
	}
	
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyCalculator cal = new MyCalculator();
	}

}

