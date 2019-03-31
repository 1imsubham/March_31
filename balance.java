import java.util.*;
class balance
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
long x,y,n,m;
x=sc.nextLong();
y=sc.nextLong();
n=sc.nextLong();
m=sc.nextLong();
x=x*n;
y=y*m;
if(x==y)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
}