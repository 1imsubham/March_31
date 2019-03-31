import java.util.*;
class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int m,n,j,k,c;
c=0;
m=sc.nextInt();
n=sc.nextInt();
for(j=m;j<=n;j++)
{
for(k=1;k<=j;k++)
{
if(j%k==0)
{
c++;
}
}
if(c==2)
{
System.out.println(j);
}
}
}
}
}
