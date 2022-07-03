import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ques27 extends JFrame implements ActionListener {
	JTextField tf1, tf2, tf3;
	int result;

	Ques27() {
		addWindowListener(new pp());

		JLabel l1 = new JLabel("Number 1 : ");
		JLabel l2 = new JLabel("Number 2 : ");
		JLabel l3 = new JLabel("Result : ");
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);

		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Sub");

		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	class pp extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("Add")) {
			result = (Integer.parseInt(tf1.getText())) + (Integer.parseInt(tf2.getText()));
		}
		if (s.equals("Sub")) {
			result = (Integer.parseInt(tf1.getText())) - (Integer.parseInt(tf2.getText()));
		}
		tf3.setText(Integer.toString(result));
	}

	public static void main(String s[]) {
		Ques27 obj = new Ques27();
		obj.setSize(500, 500);
		obj.setVisible(true);
	}
}