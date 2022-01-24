import java.awt.*;
import java.awt.event.*;
class myCheckbox extends Frame implements ItemListener
{
	Checkbox c1,c2,c3;
	String msg="";
	
	myCheckbox()
	{
		this.setLayout(new FlowLayout());
		c1= new Checkbox("Bold");
		c2= new Checkbox("Italic");
		c3= new Checkbox("Underline");
		
		this.add(c1);
		this.add(c2);
		this.add(c3);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Current status",10,100);
		msg= "Bold:" +c1.getState();
		g.drawString(msg,10,120);

		msg= "Italic:" +c2.getState();
		g.drawString(msg,10,140);

		msg= "Underline:" +c3.getState();
		g.drawString(msg,10,160);
	}
	public static void main(String[] args)
	{
		myCheckbox obj= new myCheckbox();
		obj.setSize(400,400);
		obj.setTitle("vaishnavi");
		obj.setVisible(true);
	}

}