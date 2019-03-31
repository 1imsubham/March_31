import java.util.*;
class infinity
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,q,j;
n=sc.nextInt();
q=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<q;j++)
{
int k,l,sum;
sum=a[0];
k=sc.nextInt();
for(l=k+1;l<n;l=l+k+1)
{
sum=sum+a[l];
}
System.out.println(sum);
}
}
}
}