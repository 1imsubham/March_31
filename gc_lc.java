import java.util.*;
class gc_lc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
long a,b,a1,b1,lcm;
a=0;
b=0;
lcm=0;
a=sc.nextLong();
b=sc.nextLong();
a1=a;
b1=b;
while(a!=b)
{
if(a>b)
{
a=a-b;
}
else
{
b=b-a;
}
}
lcm=(a1*b1)/a;
System.out.println(a+" "+lcm);
}
}
}