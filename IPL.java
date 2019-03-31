import java.util.*;
class IPL
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,sum=0;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
if(n%2!=0)
{
for(i=1;i<=n;i++)
{
if(i%3!=0)
{
sum=sum+a[i];
}
}
}
else
{
for(i=0;i<=n;i=i+2)
{
sum=sum+a[i];
}
}
System.out.println(sum);
}
}