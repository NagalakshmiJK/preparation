/* command line argument using
4    4    4    4
3    3    3
2    2
1
*/
class model4
{
	public void patternnumber(int n)
	{
	for(int i=n;i>0;i--)
	{
	for(int j=1;j<=i;j++)
	System.out.print(i+"\t");
	System.out.println();
	}
	} 
}
class pattern4
{
public static void main(String ar[])
{
int n=Integer.parseInt(ar[0]);
model4 m=new model4();
m.patternnumber(n);
}
}