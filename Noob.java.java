import java.util.*;
class Noob
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
int n,i;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int s=a[0];
for(i=0;i<n;i++)
{
if(a[i]<s)
{
s=a[i];
}
}
int sum=0,c=0;
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
while(sum!=0)
{
for(i=0;i<n;i++)
{
if(a[i]>0)
{
a[i]=a[i]-s;
}
}
c++;
}
System.out.println(c);
}
}