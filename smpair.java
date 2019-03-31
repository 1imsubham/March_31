import java.util.*;
class smpair
	{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t,n,i,j,k;
		t=sc.nextInt();
		for(k=0;k<t;k++)
		{
     			int sum=0,temp=0;
			n=sc.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<n-1;i++)
			{
				for(j=i+1;j<n;j++)
				{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
	        }
			        sum=a[0]+a[1];
		        System.out.println(sum);
         }
      }
}