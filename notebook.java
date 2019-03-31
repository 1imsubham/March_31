import java.util.*;
class notebook
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int x,y,k,n,i,count;
count=0;
x=sc.nextInt();
y=sc.nextInt();
k=sc.nextInt();
n=sc.nextInt();
x=x-y;
for(i=0;i<n;i++)
{
int p,c;
p=0;
c=0;
p=sc.nextInt();
c=sc.nextInt();
if(x<=p && c<=k)
{
count++;
}
}
if(count>0)
{
System.out.println("LuckyChef");
}
else
{
System.out.println("UnluckyChef");
}
}
}
}