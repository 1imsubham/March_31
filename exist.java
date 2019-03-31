import java.util.*;
class exist
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,i,c;
c=0;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n-1;i++)
{
if(Math.abs(a[i]-a[i+1])<=1)
{
c++;
}
}
if(c==(n-1))
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