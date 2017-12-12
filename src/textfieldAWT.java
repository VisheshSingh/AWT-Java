import java.awt.*;
import java.awt.event.*;
public class textfieldAWT extends Frame implements ActionListener {
	Frame f;
	TextField tf1, tf2, tf3;
	Button b1, b2;

	textfieldAWT(){
		f = new Frame("TextFiled Add and Subtract");
		tf1= new TextField();
		tf1.setBounds(30, 30, 80, 20);
		tf2= new TextField();
		tf2.setBounds(30, 60, 80, 20);
		tf3= new TextField();
		tf3.setBounds(30, 90, 80, 20);
		tf3.setEditable(false);
		
		b1 = new Button("+");
		b1.setBounds(30, 120, 30,30);
		b2 = new Button("-");
		b2.setBounds(80, 120, 30,30);
		
		b1.addActionListener(this); b2.addActionListener(this);
		
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		
		f.add(b1); f.add(b2);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		String n1 = tf1.getText();
		String n2 = tf2.getText();
		int a = Integer.parseInt(n1);
		int b = Integer.parseInt(n2);
		int c=0;
		if(ae.getSource() == b1) {
			c = a + b;
		} else if(ae.getSource() == b2) {
			c = a - b;
		}
		
		String res = String.valueOf(c);
		tf3.setText(res);
	}
	
	public static void main(String[] args) {
		new textfieldAWT();
	}
}
