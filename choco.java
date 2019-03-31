import java.util.*;
class choco
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int l,r,c,i,d;
c=1;
d=0;
l=sc.nextInt();
r=sc.nextInt();
for(i=1;i<l;i++)
{
c=c+2;
}
d=c;
for(i=0;i<r-l;i++)
{
d=d+2;
c=c+d;
}
System.out.println(c);
}
}
}