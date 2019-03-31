import java.util.*;
class app
	{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
    		while(t!=0)
    			{
			t--;
        		int n,a,b,k;
			int together,onlya,onlyb,f,i,ans;
			n=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
			k=sc.nextInt();
			together=0;
			onlya=0;
			onlyb=0;
			ans=0;
			f=0;
        		onlya=n/a;
			onlyb=n/b;
			for(i=1;i<=n;i++)
			{
			if(i%a==0 && i%b==0)
				{
				together++;
				}
			}
			ans=onlya+onlyb-(2*together);
			if(ans>=k)
				{
					System.out.println("Win");
				}
			else
				{
					System.out.println("Lose");
				}
			}
		}
}
