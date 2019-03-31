import java.util.*;
class sqmania
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum,sum1;
	sum=0;sum1=0;
        n=sc.nextInt();
        int a[]=new int[n];
	int b[]=new int[n-1];
	for(i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	for(i=0;i<(n-1);i++)
	{
	b[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
	sum+=4*a[i];
	}
	for(i=0;i<n-1;i++)
	{
	sum1+=b[i];
	}
        System.out.println(sum+sum1);
   }
}