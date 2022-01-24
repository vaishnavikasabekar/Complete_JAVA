import java.awt.*;
import java.awt.event.*;
class ColourFrame extends Frame implements ActionListener
{
	Button b1,b2,b3;

	ColourFrame ()
	{
		this.setLayout(new FlowLayout());
		b1= new Button("red");
		b2= new Button("yellow");
		b3= new Button("green");

		b1.setBounds(100,100,70,20);
		b2.setBounds(100,150,70,20);
		b3.setBounds(100,200,70,20);

		add(b1);
		add(b2);
		add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			this.setBackground(Colour.red);
		}
		if(ae.getSource()==b2)
		{
			this.setBackground(Colour.yellow);
		}
		if(ae.getSource()==b3)
		{
			this.setBackground(Colour.green);
		}
	}
	public static void main(String[] args)
	{
		ColourFrame  obj= new ColourFrame ();
		obj.setSize(400,400);
		obj.setTitle("hello");
		obj.setVisible(true);
	}
}