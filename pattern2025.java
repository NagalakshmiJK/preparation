/*
1 	            			1
2    5     				2     7
3    6    8				3     8      12
4    7    9    10			4     9      13     16
				5     10     14     17     19
				6     11      15     18     20    21
*/
import java.util.Scanner;
class pattern2025
{
public static void main(String arg[])
{
int i,j;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(i=1;i<=n;i++)
{
int c=n-1;
int v=c;
for(j=1;j<=i;j++)
{
if(j==1)
System.out.print(i+"\t");
else
{
System.out.print((i+c)+"\t");
c=c+--v;
}
}
System.out.println();
}
}
}