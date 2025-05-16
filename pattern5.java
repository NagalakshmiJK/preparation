/*
4    3    2    1
4    3    2
4    3 
4
*/
import java.io.*;
class pattern5
{
public static void main(String arg[])throws IOException
{
DataInputStream d= new DataInputStream(System.in);
int n=Integer.parseInt(d.readLine());
model5(n);
}

static void model5(int n)
{
for(int i=1;i<=n;i++)
{
for(int j=n;j>=i;j--)
System.out.print(j+"\t");
System.out.println();
}

}
}