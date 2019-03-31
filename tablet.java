import java.util.*;
class tablet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int i,n,b,max;
max=0;
n=sc.nextInt();
b=sc.nextInt();
for(i=0;i<n;i++)
{
int w,h,p,temp;
temp=0;
w=sc.nextInt();
h=sc.nextInt();
p=sc.nextInt();
temp=w*h;
if(p<=b)
{
if(temp>=max)
{
max=temp;
}
}
}
if(max==0)
{
System.out.println("no tablet");
}
else
{
System.out.println(max);
}
}
}
}
