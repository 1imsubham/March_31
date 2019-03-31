import java.util.*;
class first
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int a,b,n;
double pow,pow1;
a=sc.nextInt();
b=sc.nextInt();
n=sc.nextInt();
pow = Math.pow(a, n);
pow1 = Math.pow(b, n);
if(pow>pow1)
{
System.out.println("1");
}
if(pow<pow1)
{
System.out.println("2");
}
if(pow==pow1)
{
System.out.println("0");
}
}
}
}