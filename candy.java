import java.util.*;
class candy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i,j;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,sum=0;
n=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
sum=sum+a[j];
}
if(sum%2==0)
{
System.out.println("NO");
}
else
{
System.out.println("YES");
}
}
}
}

