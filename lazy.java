import java.util.*;
class lazy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,r,j,c;
c=0;
n=sc.nextInt();
r=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
if(a[j]<=r)
{
c++;
}
}
System.out.println(n+" "+c+" "+c);
}
}
}
 