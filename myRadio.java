import java.awt.*;
import java.awt.event.*;
class myRadio extends Frame implements ItemListener
{
	Checkbox c1,c2;
	CheckboxGroup cbg;
	String msg="";

	myRadio()
	{
		this.setLayout( new FlowLayout());
		cbg= new CheckboxGroup();
		c1= new Checkbox("yes",cbg,true);
		c2= new Checkbox("No",cbg,false);
		
		this.add(c1);
		this.add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Current selection: ";
		msg+=cbg. getSelectedCheckbox().getLabel();
		g.drawString(msg,10,100);
	}
	public static void main(String[] args)
	{
		myRadio obj= new myRadio();
		obj.setSize(400,400);
		obj.setTitle("Hello");
		obj.setVisible(true);
	}

}