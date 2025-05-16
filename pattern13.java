/*
1
2   1
3   2   1
4   3   2    1
*/
import java.util.Scanner;
class pattern
{
    int x;
    pattern(int m)
    {
        int x=m;
        for(int i=1;i<=x;i++)
        {
              for(int j=i;j>0;j--)
                    System.out.print(j+"\t");
              System.out.println();
        }
    }
}
class pattern13
{
public static void main(String arg[])
{
Scanner s= new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
pattern p=new pattern(n);
}
}