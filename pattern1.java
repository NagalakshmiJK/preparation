
/*
1
1      2
1      2     3
1      2     3    4
*/

import java.io.*;
class oopspattern
{
	public void patternnumber(int n)
	{
	for(int i=1;i<=n;i++)
	{
	for(int j=1;j<=i;j++)
	System.out.print(j+"\t");
	System.out.print("\n");
	}
	}
}

class pattern1
{
public static void main(String arg[])throws IOException
{
DataInputStream d=new DataInputStream(System.in);
int n=Integer.parseInt(d.readLine());
oopspattern o=new oopspattern();
o.patternnumber(n);
}
}