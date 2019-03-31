import java.util.*;
class assign
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,m,i,d,c,max;
n=sc.nextInt();
m=sc.nextInt();
max=0;
d=0;
c=0;
int a[]=new int[m];
for(i=0;i<m;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
if(a[0]<=n)
{
max=a[0];
d=1;
}
for(i=1;i<m;i++)
{
max=max+a[i];
if(max<=m)
{
c++;
}
}
System.out.println(d+c);
}
}
}