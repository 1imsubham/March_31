import java.util.*;
class elemagic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,k,j,c;
c=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
int s,sum;
s=0;
sum=0;
s=a[j]+k;
for(k=0;k<n;k++)
{
if(a[k]!=a[j])
{
sum=sum+a[k];
}
}
if(s>sum)
{
c++;
}
}
System.out.println(c);
}
}
}
