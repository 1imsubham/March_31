import java.util.*;
class luckygame
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,a,b,j,c,d;
c=0;
d=0;
n=sc.nextInt();
a=sc.nextInt();
b=sc.nextInt();
int arr[]=new int[n];
for(j=0;j<n;j++)
{
arr[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
if(arr[j]%a==0)
{
c++;
}
}
for(j=0;j<n;j++)
{
if(arr[j]%b==0)
{
d++;
}
}
if(c==d)
{
System.out.println("BOB");
}
else if(c>d)
{
System.out.println("BOB");
}
else
{
System.out.println("ALICE");
}
}
}
}