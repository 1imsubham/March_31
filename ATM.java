import java.util.*;
class atm
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,k,j;
k=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
if(a[j]<=k)
{
k=k-a[j];
System.out.print("1");
}
else
{
System.out.print("0");
}
}
System.out.println();
}
}
}
