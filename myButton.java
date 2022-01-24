import java.awt.*;
class myButton extends Frame 
{
	Button B1,B2,B3,B4;
	myButton()
	{
		setLayout(new BorderLayout(10,10));
		B1= new Button("Button 1");
		B2= new Button("Button 2");
		B3= new Button("Button 3");
		B4= new Button("Button 4");

		add("North" , B1);
		add("East" , B2);
		add("South" , B3);
		add("Center" , B4);
	}
	public static void main(String[] args)
	{
		myButton obj= new myButton();
		obj.setSize(400,400);
		obj.setTitle("Button");
		obj.setVisible(true);
	}
}