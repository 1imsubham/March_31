import java.util.*;
class Bigsale
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,j;
double l=0;
n=sc.nextInt();
for(j=0;j<n;j++)
{
int p,q,d;
float p1=0;
float p2=0;
p=sc.nextInt();
q=sc.nextInt();
d=sc.nextInt();
p1=p+ (d*p)/100;
p2=p1- (d*p1)/100;
l=l+ q*(p-p2);
}
System.out.println(l);
}
}
}