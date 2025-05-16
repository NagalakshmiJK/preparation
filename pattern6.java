/* command line using
1    2    3   4
1    2    3
1    2
1
*/
class pattern6
{
public static void main(String para[])
{
int n=Integer.parseInt(para[0]);
patternmodel6(n);
}

static void patternmodel6(int n)
{
for(int i=n;i>0;i--)
{
for(int j=1;j<=i;j++)
System.out.print(j+"\t");
System.out.println();
}
}
}