import java.io.*;
class filewritebuffer
{
	public static void main(String[] args)throws IOException
	{
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("a.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		char ch;
		System.out.println("enter data & @ at the end");
		while((ch=(char)dis.read())!='@')
		{
			bout.write(ch);
		}
		bout.close();
	}
}