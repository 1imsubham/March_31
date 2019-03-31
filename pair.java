import java.util.*;
class pair
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,i,sum;
sum=0;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
sum=a[0]+a[1];
System.out.println(sum);
}
}
}