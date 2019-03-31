import java.util.*;
class Pall
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int a,rem,sum=0,n;
a=sc.nextInt();
n=a;
while(a!=0)
{
rem=a%10;
sum=rem+(sum*10);
a=a/10;
}
if(n==sum)
{
System.out.println("wins");
}
else
{
System.out.println("losses");
}
}
}
}