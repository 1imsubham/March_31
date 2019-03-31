import java.util.*;
class distinct
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,k,i,j,s,c,s1;
c=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
s=0;
s1=0;
s=a[i]+k;
a[i]=0;
for(j=0;j<n;j++)
{
s1=s1+a[j];
}
if(s>s1)
{
c++;
}
}
System.out.println(c);
}
}
}