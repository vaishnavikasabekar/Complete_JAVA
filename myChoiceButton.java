import java.awt.*;
import java.awt.event.*;
class  myChoiceButton extends Frame implements ItemListener
{
		String msg;
		Choice ch;
		
		myChoiceButton()
		{
			this.setLayout(new FlowLayout());
			ch= new Choice();
			ch.add("English");
			ch.add("Marathi");
			ch.add("Hindi");

			this.add(ch);
			ch.addItemListener(this);
		}
		public void itemStateChanged(ItemEvent ie)
		{
			repaint();
		}
		public void Paint(Graphics g)
		{
			g.drawString("Selected lang:",10,100);
			msg= ch.getSelectedItem();
			g.drawString(msg,10,120);
		}
		public static void main(String[] args)
		{
			myChoiceButton obj= new myChoiceButton();
			obj.setSize(400,400);
			obj.setTitle("Hello");
			obj.setVisible(true);
		}
}