import java.util.*;
class pcj1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,j,sum=0;
n=sc.nextInt();
if(n%2==0)
{
for(j=2;j<=n;j+=2)
{
sum=sum+(j*j);
}
}
else
{
for(j=1;j<=n;j+=2)
{
sum=sum+(j*j);
}
}
System.out.println(sum);
}
}
}