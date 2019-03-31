import java.util.*;
class rich
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int x,n,j,s;
s=0;
x=sc.nextInt();
n=sc.nextInt();
for(j=1;j<=n;j++)
{
if(j%x==0)
{
s=s+j;
}
}
System.out.println(s);
}
}
}