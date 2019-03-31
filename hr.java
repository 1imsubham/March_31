import java.util.*;
class hr
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int a,rem,sum=0,c=0;
			a=sc.nextInt();
			while(a>0)
				{
					rem=a%10;
					sum=(sum*10)+rem;
					a=a/10;
					c=c+1;
				}
			if(c==1)
				{
				System.out.println("1");
				}

			if(c==2)
				{
				System.out.println("2");
				}

			if(c==3)
				{
				System.out.println("3");
				}

			if(c>3)
				{
				System.out.println("More than 3 digits");
				}	
		}
}			
					