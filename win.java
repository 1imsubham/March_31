import java.util.*;
class win
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i,j;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,big,bigb,sum=0,sums=0;
n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
b[j]=sc.nextInt();
}
big=a[0];
for(j=0;j<n;j++)
{
if(a[j]>big)
{
big=a[j];
}
}
bigb=b[0];
for(j=0;j<n;j++)
{
if(b[j]>bigb)
{
bigb=b[j];
}
}
for(j=0;j<n;j++)
{
sum=sum+a[j];
}
for(j=0;j<n;j++)
{
sums=sums+b[j];
}
sum=sum-big;
sums=sums-bigb;
if(sum>sums)
{
System.out.println("Bob");
}
if(sums>sum)
{
System.out.println("Alice");
}
if(sum==sums)
{
System.out.println("Draw");
}
}
}
}
