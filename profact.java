import java.util.*;
class profact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,p,c,i;
p=1;
c=0;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
p=p*a[i];
}
for(i=1;i<=p;i++)
{
if(p%i==0)
{
c++;
}
}
System.out.println(c);
}
}
}