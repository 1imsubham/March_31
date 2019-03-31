import java.util.*;
class pcj
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,s,c=0,j;
n=sc.nextInt();
s=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
if(a[j]>=s)
{
c++;
}
}
if(c>=1)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
}