/* command line argument using pattern program
1
2    3
4    5    6 
7     8    9    10 
11    12   13   14    15    
*/
class model2
{
        public void patternnumber(int x)
        {
               int a=1; 
               for(int i=1;i<=x;i++)
               {
	for(int j=1;j<=i;j++)
	System.out.print(a++ +"\t");
	System.out.print("\n");
                }
        }
}
class pattern2
{
public static void main(String arg[])
{
int n=Integer.parseInt(arg[0]);
model2 m=new model2();
m.patternnumber(n);
}
}