import java.awt.*;
import javax.swing.*;

class smile extends Canvas
{
	public void paint(Graphics g)
	{
		g.drawOval(80, 70, 150, 150);
		g.setColor(Color.BLACK);
		g.fillOval(120, 120, 15, 15);
		g.fillOval(170, 120, 15, 15);
		g.drawArc(130, 160, 50, 20, 180, 180);
	}
}

class Ques26
{
	public static void main(String args[])
	{
		smile obj = new smile();
		JFrame jf = new JFrame();
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.add(obj);
	}
}
