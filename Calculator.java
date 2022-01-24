import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
	Panel p1,p2;
	TextFeild t1;
	Button [] b= new Button[10];
	Button add,sub,mul,div,eq,CLR;
	
	int v1,v2,res;
	char op;

	Calculator()
	{
		p1= new Panel();
		p2= new Panel();

		p1.setLayout( new gridLayout(1,1));
		p2.setLayout( new gridLayout(4,4));
		t1= new TextFeild(20);
		for(int i=0;i<10;i++)
		{
			b[i]= new Button(i+ "");
		}
		add= new Button("+");
		sub= new Button("-");
		mult= new Button("*");
		div= new Button("/");
		eq= new Button("eq");
		clr= new Button("CLR");
		
		p1.add(t1);
		 
		for(int i=0;i<10;i++)
		{
			p2.add(b[i]);

		}
		p2.add(add);
		p2.add(sub);
		p2.add(mult);
		p2.add(div);
		p2.add(eq);
		p2.add(clr);

		for(int i=0;i<10;i++)
		{
			b[i].addactionListener(this);
		}
		add.addactionListener(this);
		sub.addactionListener(this);
		mult.addactionListener(this);
		div.addactionListener(this);
		eq.addactionListener(this);
		clr.addactionListener(this);

		this.setLayout(new BorderLayout(5,5));
		this.add(p1.BorderLayout.NORTH);
		this.add(p2.BorderLayout.CENTER);

		
	}
	public void Actionperformed(ActionEvent ae)
	{
		String str= ae.getActionCommand();
		char ch = str.charAt(0);
		
		if(character.isdigit(ch))
		{
			t1.setText(t1.getText()+str);
			
		}
		else
		{
			if(str.equals("+"))
			{
				v1= Integer.parseInt(t1.getText);
				op= "+";
				t1.setText("");
			
			}
			if(str.equals("-"))
			{
				v1 =Interder.parseInt(t1.getText);
				op= "-";
				t1.setText("");
			}
			if(str.equals("*"))
			{
				v1 =Interder.parseInt(t1.getText);
				op= "*";
				t1.setText("");
			}
			if(str.equals("/"))
			{
				v1 =Interder.parseInt(t1.getText);
				op= "/";
				t1.setText("");
			}
			if(str.equals("="))
			{
				v2= Integer.parseInt(t1.getText());
			)
			if(op=='+')
			{
				res= v1+v2;
			}
			if(op=='-')
			{
				res= v1-v2;
			}
			if(op=='*')
			{
				res= v1*v2;
			}
			if(op=='/')
			{
				res= v1/v2;
			}
			t1.setText(res+ " ");
			
			
	   }
	   else
	   {
		t1.setText("");
	   }
  }
	 public static void main(String[] args)
	{
		Calculator c = new Calculator();
		c = setSize(400,400);
		c = setsize("Calculator");
		c  = setVisible(true);
	}
	
}