import java.util.*;
class proc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int k,n,j,sum=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
sum=a[k-1]+a[k];
System.out.println(sum);
}
}
}