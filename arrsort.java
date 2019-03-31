import java.util.*;
class arrsort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,k,j;
double sum,avg;
sum=0;
avg=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
Arrays.sort(a);
for(j=0+k;j<n-k;j++)
{
sum+=a[j];
}
avg=sum/(n-(2*k));
System.out.format("%.6f\n",avg);
}
}
}