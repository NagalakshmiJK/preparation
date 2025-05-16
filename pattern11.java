/*
1    1    1     1
2    2    2     2
3    3    3     3 
4    4    4     4
*/
import java.util.Scanner;
class number
{
    int m;
    void numberpattern(int n)
    {
        m=n;
        for(int i=1;i<=m;i++)
        {
              for(int j=1;j<=m;j++)
              System.out.print(i+"\t");
              System.out.println();
        }
    }
}
class pattern11
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
number x=new number();
x.numberpattern(n);
}
}