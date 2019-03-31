import java.util.*;
class st
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,j;
n=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
int c;
c=0;
for(j=0;j<n;j++)
{
if(a[j]==1)
{
c=c+1;
}
else
{
c=c-1;
}
}
if(c!=0)
{
System.out.println("Invalid");
}
else
{
System.out.println("Valid");
}
}
}
}