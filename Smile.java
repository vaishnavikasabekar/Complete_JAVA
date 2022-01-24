import java.awt.*;
import java.awt.event.*;
class Smile extends Frame
{
	Smile()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(40,40,200,200);

		g.setColor(Color.yellow);
		g.fillOval(50,50,180,180);

		g.setColor(Color.black);
		g.fillOval(110,95,5,5);
		g.fillOval(145,95,5,5);

		g.drawLine(130,95,130,115);

		g.setColor(Color.red);
		g.fillArc(50,100,150,150,180,-180);
		
	}
	public static void main(String[] args)
	{
		Smile obj = new Smile();
		obj.setSize(400,400);
		obj.setTitle("Smile");
		obj.setVisible(true);
	}

}