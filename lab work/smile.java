import java.awt.*;
import javax.swing.*;

class smile extends Canvas
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawOval(150,100,200,200);
		g.drawOval(210,150,25,25);
		g.drawOval(260,150,25,25);
		
		g.drawArc(220,160,50,85,0,-180);
	}
}

class Demo
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
	
