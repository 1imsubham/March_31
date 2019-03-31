import java.util.*;
class h
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int a,b,s=0,d=0;
			a=sc.nextInt();
			b=sc.nextInt();
			if(a>b)
				{
					d=a-b;
					System.out.println(d);
				}
			else
				{
					s=a+b;
					System.out.println(s);
				}
		}
}
			