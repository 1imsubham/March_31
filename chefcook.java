import java.util.*;
class chefcook
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int a,b,k,sum,d;
sum=0;
d=0;
a=sc.nextInt();
b=sc.nextInt();
k=sc.nextInt();
sum=a+b;
d=sum/k;
if(d%2==0)
{
System.out.println("CHEF");
}
else
{
System.out.println("COOK");
}
}
}
}