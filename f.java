import java.util.*;
class f
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int l,b,a=0,p=0;
	l=sc.nextInt();
	b=sc.nextInt();
	a=l*b;
	p=2*(l+b);
	if(a>p)
		{
		System.out.println("Area");
		System.out.println(a);
		}
	else
		{
		System.out.println("Peri");
		System.out.println(p);
		}
}
}