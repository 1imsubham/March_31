import java.util.*;
class ppsum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i,j,k;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int d,n,sum;
d=0;
n=0;
sum=0;
d=sc.nextInt();
n=sc.nextInt();
for(j=0;j<d;j++)
{
sum=0;
for(k=1;k<=n;k++)
{
sum=sum+k;
}
n=sum;
}
System.out.println(sum);
}
}
}