import java.awt.*;
class myLogin1 extends Frame
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;

	myLogin1()
	{
		this.setLayout(new FlowLayout());

		l1= new Label("username");
		l2= new Label("passward");
		t1= new TextField(20);
		t2= new TextField(20);
		b1= new Button("login");

		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(b1);
	}
	public static void main(String[] args)
	{
		myLogin1 obj= new myLogin1();
		obj.setSize(400,400);
		obj.setTitle("Hello");
		obj.setVisible(true);
	}


}