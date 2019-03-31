import java.util.*;
class ChefRun
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int x1,x2,x3,v1,v2;
int a,b;
a=0;
b=0;
x1=sc.nextInt();
x2=sc.nextInt();
x3=sc.nextInt();
v1=sc.nextInt();
v2=sc.nextInt();
a=x3-x1;
b=x2-x3;
if(a==b && v1<v2)
{
System.out.println("Kefa");
}
if(a==b && v1>v2)
{
System.out.println("Chef");
}
if(a<b && v1<v2)
{
System.out.println("Chef");
}
if(a<b && v1>v2)
{
System.out.println("Chef");
}
if(a==b && v1==v2)
{
System.out.println("Draw");
}
}
}
}