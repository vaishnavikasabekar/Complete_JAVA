interface DB
{
	void connect();
	void disconnect();
}
class oracleDB implements DB
{
	public void connect()
	{
		System.out.println("connected to oracle DB");
		
	}
	public void disconnect()
	{
		System.out.println("disconnected from oracle DB");
	}
}
class mySQLDB implements DB
{
	public void connect()
	{
		System.out.println("connected to mySQL DB");
		
	}
	public void disconnect()
	{
		System.out.println("disconnected from mySQL DB");
	}
}
class demo6
{
	public static void main(String[] args)	
	{
		DB ref;
		ref =new oracleDB();
		ref.connect();
		ref.disconnect();
		ref=new mySQLDB();
		ref.connect();
		ref.disconnect();
	}
}
