/*
1
2    2
3    3     3
4    4     4     4
*/
import java.util.Scanner; 
class pattern12
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
         System.out.print(i+"\t");
    System.out.println();
}
}
}