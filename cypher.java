import java.util.*;
class cypher
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,n,m,q;
n=sc.nextInt();
m=sc.nextInt();
q=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<q;i++)
{
int x,y;
x=sc.nextInt();
y=sc.nextInt();
for(j=x;j<=y;j++)
{
if(m>a[j])
{
System.out.println("Happy");
}
else
{
System.out.println("Sad");
}
}
}
}
}