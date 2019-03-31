import java.util.*;
class me
	{
	public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		int n,i,j=0,k=0;
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(b[i]==3)
			{
				j=j+a[i];
				k=k+b[i];
			}
			if(b[i]==1||b[i]==2)
			{
				j=j+a[i];
				k=k+b[i];
			}
				if(k==3)
			break;
		}
		System.out.println(j+k);
		}
	}