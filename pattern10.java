/*
25    20    15    10    5
16    12    8    4
9    6    3
4    2
1
*/
import java.io.*;
class pattern10
{
public static void main(String arg[])throws IOException
{
DataInputStream d=new DataInputStream(System.in);
int n=Integer.parseInt(d.readLine());
for(int  i=n;i>0;i--)
{
for(int j=i;j>0;j--)
System.out.print(i*j+"\t");
System.out.println();
}
}
}