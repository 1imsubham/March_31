import java.util.*;
class jewel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,k,i,sum;
sum=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(i=n-k;i<n;i++)
{
sum=sum+a[i];
}
System.out.println(sum);
}
}
}