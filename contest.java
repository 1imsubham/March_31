import java.util.*;
class contest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,p,j,c,d;
c=0;
d=0;
n=sc.nextInt();
p=sc.nextInt();
for(j=0;j<n;j++)
{
int s;
s=sc.nextInt();
if(s>=(p/2))
{
c++;
}
if(s<=(p/10))
{
d++;
}
}
if(c==1 && d==2)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
}
  