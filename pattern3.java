/*
4
4    3
4    3    2
4    3    2   1
*/
import java.io.*;
class model3
{
private int n;
	public void patternnumber()throws IOException
	{
	DataInputStream d=new DataInputStream(System.in);
	n=Integer.parseInt(d.readLine());
	for(int i=n;i>0;i--)
	{
	for(int j=n;j>=i;j--)
	System.out.print(j+"\t");
	System.out.println();
	}	
	}
}
class pattern3
{
public static void main(String arg[])throws IOException
{
model3 m=new model3();
m.patternnumber();
}
}