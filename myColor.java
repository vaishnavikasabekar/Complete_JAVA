import java.awt.*;
import java.awt.event.*;
class myColor extends Frame implements ActionListener
{
	Button b1,b2,b3;
	myColor()
	
	{
		this.setLayout(new FlowLayout());
		b1= new Button("Red");
		b2= new Button("Yellow");
		b3= new Button("Green");

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
			this.setBackground(Color.red);
		}
		if(ae.getSource()==b2)
		{
			this.setBackground(Color.yellow);
		}
		if(ae.getSource()==b3)
		{
			this.setBackground(Color.green);
		}
	}
	public static void main(String[] args)
	{
		myColor  obj= new myColor ();
		obj.setSize(400,400);
		obj.setTitle("hello");
		obj.setVisible(true);
	}
}