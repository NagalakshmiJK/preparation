/*
1
2   4
3   6   9 
4   8   12   16
5   10   15   20   25
*/
import java.io.*;
class pattern8
{
public static void main(String arg[])throws IOException
{
DataInputStream d=new DataInputStream(System.in);
int n=Integer.parseInt(d.readLine());
patternmodel8(n);
}
 
static void patternmodel8(int n)
{
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
System.out.print(j*i+"\t");
System.out.println();
}
}
}