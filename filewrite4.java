import java.io.*;
class filewrite4
{
	public static void main(String[] args) throws IOException
	{
		String str="Hello this is a java book";
		FileWriter fw=new FileWriter("a.txt");
		BufferedWriter br=new BufferedWriter(fw);
		for(int i=0;i<str.length();i++)
		{
			fw.write(str.charAt(i));
		}
		fw.close();
	}
}