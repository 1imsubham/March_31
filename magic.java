import java.util.*;
class magic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,m,j,c=0;
n=sc.nextInt();
m=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
if(a[j]%m==0)
{
c++;
}
}
System.out.println(c);
}
}
}