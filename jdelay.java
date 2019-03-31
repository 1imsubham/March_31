import java.util.*;
class jdelay
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,c,j;
c=0;
n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
b[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
if((b[j]-a[j])>5)
{
c++;
}
}
System.out.println(c);
}
}
}