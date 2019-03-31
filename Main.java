import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,sum=0;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println(sum);
}
}
