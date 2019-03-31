import java.util.*;
class sins
	{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x,y,t,i,temp=0;
		t=sc.nextInt();
		for(i=0;i<t;i++)
			{
			x=sc.nextInt();
			y=sc.nextInt();
			while(y!=0)
				{
				temp=x%y;		
				x=y;
				y=temp;
				}
			System.out.println(2*x);
			}
		}
	}
				