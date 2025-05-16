/*
1   1   1   1
2   2   2
3   3
4
*/
import java.util.Scanner;
class patternmodel
{
      int a;
      patternmodel(int x)
      {
           a=x;
           for(int i=1;i<=a;i++)
           {
                  for(int j=a;j>=i;j--)
                      System.out.print(i+"\t");
                  System.out.println();
           } 
      }
}
class pattern14
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
patternmodel p=new patternmodel(n);
}
}