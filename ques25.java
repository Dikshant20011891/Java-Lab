import java.awt.*;
import javax.swing.*;

class Student extends JFrame
{
	Student()
	{
		JLabel l1 = new JLabel("Name : ");
		JLabel l2 = new JLabel("Student Id : ");
		JLabel l3 = new JLabel("University Roll No. : ");
		JLabel l4 = new JLabel("Section : ");
		
		JTextField jf1 = new JTextField(20);
		JTextField jf2 = new JTextField(20);
		JTextField jf3 = new JTextField(20);
		JTextField jf4 = new JTextField(20);
		JButton b1 = new JButton("Submit");
		setLayout(new FlowLayout());
		add(l1);
		add(jf1);
		add(l2);
		add(jf2);
		add(l3);
		add(jf3);
		add(l4);
		add(jf4);
		add(b1);
	}
	
	public static void main(String args[])
	{
		Student obj = new Student();
		obj.setSize(400,500);
		obj.setVisible(true);
	}
}
