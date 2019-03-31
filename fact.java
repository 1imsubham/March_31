import java.util.*;
class fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,fact,t,n;
t=sc.nextInt();
for(i=0;i<t;i++)
{
fact=1;
n=sc.nextInt();
for(j=1;j<=n;j++)
{
fact=fact*j;
}
System.out.println(fact);
}
}
}