import java.awt.*;
import javax.swing.*;

class Ques25 extends JFrame {
	Ques25() {
		setLayout(new FlowLayout());
		JLabel l1 = new JLabel("Name");
		JTextField tf1 = new JTextField(20);
		JLabel l2 = new JLabel("Section");
		JTextField tf2 = new JTextField(20);
		JLabel l3 = new JLabel("Roll No");
		JTextField tf3 = new JTextField(20);
		JLabel l4 = new JLabel("Email ID");
		JTextField tf4 = new JTextField(20);
		JButton b1 = new JButton("Submit");
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(l4);
		add(tf4);
		add(b1);
	}

	public static void main(String args[]) {
		Ques25 d = new Ques25();
		d.setSize(300,400);
		d.setVisible(true);
	}
}
