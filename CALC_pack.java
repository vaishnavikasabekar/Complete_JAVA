import java.util.*;
import pack.*;
public class CALC_pack
{
	Scanner sc =new Scanner(system.in);
	int a,b,c,d;
	System.out.println("enter any 2 numbers:")
	a= sc.nextInt();
	b= sc.nextInt();
	
	CALC obj =new CALC();
	c= obj.add(a,b);
	d= obj.sub(a,b);
	

	System.out.println("Add is:"+c);
	System.out.println("Sub is:"+d);
	
}