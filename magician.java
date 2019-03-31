import java.util.*;
class magician
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,x,s,j;
n=sc.nextInt();
x=sc.nextInt();
s=sc.nextInt();
s=2*s;
int a[]=new int[s];
for(j=0;j<s;j++)
{
a[j]=sc.nextInt();
}
System.out.println(a[s-2]);
}
}
}
