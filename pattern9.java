/*
2
4    6
8    10    12
14   16   18   20
*/
import java.io.*;
class pattern9
{
public static void main(String arg[])throws IOException
{
DataInputStream d=new DataInputStream(System.in);
int n=Integer.parseInt(d.readLine());
int a=2;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(a+"\t");
a+=2;
}
System.out.println();
}
}
}