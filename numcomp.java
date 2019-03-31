import java.util.*;
import java.lang.*;
class numcomp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int a,b,n;
a=sc.nextInt();
b=sc.nextInt();
n=sc.nextInt();
if(Math.pow(a,n)>Math.pow(b,n))
{
System.out.println("1");
}
if(Math.pow(a,n)<Math.pow(b,n))
{
System.out.println("2");
}
if(Math.pow(a,n)==Math.pow(b,n))
{
System.out.println("0");
}
}
}
}