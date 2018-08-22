
import java.util.Scanner;
public class Search
{
   public static void main(String[] args)
{ int f=-1;
int a[]={1,4,6,7,8,9,10};
Scanner sc = new Scanner(System.in);
int n,i,j;
System.out.println("Enter number to be searched: ");
n=sc.nextInt();
for(i=0;i<7;i++)
{
if(n==a[i])
{
System.out.println(n + "Element found");
f=1;
break;
}
}
if(f ==-1)
System.out.println("Element Not found.");
}
}