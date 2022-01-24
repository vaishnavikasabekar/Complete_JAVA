import java.awt.*;
import java.awt.event.*;
class myAdd extends Frame implements ActionListener
{

	
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1;
	
	myAdd()
	{
		this.setLayout(new FlowLayout());
		l1= new Label("Num1");
		l2= new Label("Num2");
		l3= new Label("Result");
		t1= new TextField(20);
		t2= new TextField(20);
		t3= new TextField(20);
		b1= new Button("Add");

		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(b1);
		this.add(l3);
		this.add(t3);
		b1.addActionListener(this);
		

	}
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,c;
		a= Integer.parseInt(t1.getText());
		b= Integer.parseInt(t2.getText());
		c= a+b;
		t3.setText(c+" ");
	}
	public static void main(String[] args)
	{
		myAdd obj= new myAdd();
		obj.setSize(400,400);
		obj.setTitle("Hello");
		obj.setVisible(true);

		
	}
}