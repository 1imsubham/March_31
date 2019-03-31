import java.util.*;
class sqcb
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,j;
int c=1;
n=sc.nextInt();
for(j=1;j<=n;j++)
{
if((j*j)<=n || (j*j*j)<=n)
{
c++;
}
}
System.out.println(c);
}
}
}