import java.util.*;
class divisor
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,q,j,c;
c=0;
n=sc.nextInt();
q=sc.nextInt();
for(j=1;j<=n;j++)
{
if(n%j==0 && j%q==0)
{
c++;
}
}
System.out.println(c);
}
}
}