import java.util.*;
class min
{
public static void main(String args[])
{
int t,i;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,k,j,s1,s2;
s1=0;
s2=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
Arrays.sort(a);
for(j=0;j<k;j++)
{
s1=s1+a[j];
}
for(j=k;j<n;j++)
{
s2=s2+a[j];
}
System.out.println(s2-s1);
}
}
}