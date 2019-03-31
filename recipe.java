import java.util.*;
class recipe
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int i,x1,x2,x3,v1,v2;
for(i=0;i<t;i++)
{
x1=sc.nextInt();
x2=sc.nextInt();
x3=sc.nextInt();
v1=sc.nextInt();
v2=sc.nextInt();
int c=x3-x1;
int k=x3-x2;
int cv=c*v1;
int kv=k*v2;
if(kv>cv)
{
System.out.println("Kefa");
}
if(cv>kv)
{
System.out.println("Chef");
}
}
}
}