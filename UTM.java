import java.util.*;
class UTM
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i,j,x,s;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,k,sum=0;
n=sc.nextInt();
k=sc.nextInt();
s=n+k;
int a[]=new int[s];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(x=0;x<k;x++)
{
for(j=0;j<s;j++)
{
sum=sum+a[j];
}
a[n]=sum+1;
n++;
}
if(a[s]%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}
}