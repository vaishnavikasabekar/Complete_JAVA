import java.awt.*;
import java.awt.event.*;
class  myList extends Frame implements ItemListener
{
		int [] msg;
		List lst;
		
		
		myList()
		{
			this.setLayout(new FlowLayout());
			lst= new List(4,true);
			lst.add("English");
			lst.add("Marathi");
			lst.add("Hindi");

			this.add(lst);
			lst.addItemListener(this);
		}
		public void itemStateChanged(ItemEvent ie)
		{
			repaint();
		}
		public void Paint(Graphics g)
		{
			g.drawString("Selected lang:",10,100);
			msg= lst.getSelectedIndexes();
			
			for(int i=0; i< msg.length; i++)
			{
				String item= lst.getItem(msg[i]);
				g.drawString(item,10,20+i*20);
			}
		}
		public static void main(String[] args)
		{
			myList obj =new myList();
			obj.setSize(400,400);
			obj.setTitle("Hello");
			obj.setVisible(true);
		}
}