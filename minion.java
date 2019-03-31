import java.util.*;
class minion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i,j;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,k,flag=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
a[j]=a[j]+k;
}
for(j=0;j<n;j++)
{
if(a[j]%7==0)
{
flag++;
}
}
System.out.println(flag);
}
}
}