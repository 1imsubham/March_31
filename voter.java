import java.util.*;
class voter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int l,i,y,n;
y=0;
n=0;
l=sc.nextInt();
int a[]=new int[l];
for(i=0;i<l;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<l;i++)
{
if(a[i]==1)
{
y++;
}
if(a[i]==-1)
{
n++;
}
}
if(y>=n)
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
