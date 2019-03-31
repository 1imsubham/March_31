import java.util.*;
class fibo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int t,i;
t=s.nextInt();
for(i=0;i<t;i++)
{
int n,a,b,c,sum;
n=sc.nextInt();
a=0;
b=1;
c=0;
sum=0;
for(i=0;i<n;i++)
{
c=a+b;
a=b;
b=c;
if(c%2==0)
{
sum=sum+c;
}
}
System.out.println(sum);
}
}
}