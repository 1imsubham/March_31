import java.util.*;
class prb
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,c=0,j;
n=sc.nextInt();
for(j=1;j<=n;j++)
{
if(n%j==0)
{
c=c+1;
}
}
if(c==2)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
}