/*
4
3    3
2   2    2  
1    1    1    1
*/
import java.io.*;
class pattern7
{
public static void main(String arg[])throws IOException
{
DataInputStream d=new DataInputStream(System.in);
int n=Integer.parseInt(d.readLine());
patternmodel7(n);
}

static void patternmodel7(int n)
{
for(int i=n;i>0;i--)
{
for(int j=n;j>=i;j--)
System.out.print(i+"\t");
System.out.println();
}
}
}