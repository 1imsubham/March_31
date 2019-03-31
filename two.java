import java.util.*;
class two
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int a,b,n,c,d;
a=sc.nextInt();
b=sc.nextInt();
n=sc.nextInt();
c=0;
d=0;
if(n%2!=0)
{
a=a*2;
}
if(a>b)
{
c=a;
d=b;
}
else
{
c=b;
d=a;
}
System.out.println(c/d);
}
}
}