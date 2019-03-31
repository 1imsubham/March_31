import java.util.*;
class Naive
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,n,a,b,i,j,k=0,l=0;
double p;
t=sc.nextInt();
for(i=0;i<t;i++)
{
n=sc.nextInt();
int x[]=new int[n];
a=sc.nextInt();
b=sc.nextInt();
for(j=0;j<n;j++)
{
x[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
if(a==x[j])
{
k++;
}
}
for(j=0;j<n;j++)
{
if(b==x[j])
{
l++;
}
}
p=(k/n)*(l/n);
System.out.println(p);
}
}
}
 