import java.util.*;
class stamp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,s1,s2;
s1=0;
s2=0;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
s1=s1+a[i];
}
for(i=1;i<=n;i++)
{
s2=s2+i;
}
if(s1==s2)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}