import java.util.*;
class qualify
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,k,i,temp,c;
c=0;
temp=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
temp=a[k-1];
for(i=0;i<n;i++)
{
if(a[i]>=temp)
{
c++;
}
}
System.out.println(c);
}
}
}