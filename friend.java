import java.util.*;
class friend
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,n,k,temp=0,u=0,v=0,i,j,l;
int a[]=new int[1000];
t=sc.nextInt();
for(i=0;i<t;i++)
{
n=sc.nextInt();
k=sc.nextInt();
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(i=0;i<k;i++)
{
temp=a[i];
a[i]=a[i+1];
a[i+1]=temp;
}
for(l=1;l<=n;l++)
{
if(l%2==0)
{
v=v+a[l];
}
else
{
u=u+a[l];
}
}
if(u>v)
System.out.println("NO");
else
{
System.out.println("YES");
}
}
}
}