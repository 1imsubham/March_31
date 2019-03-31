import java.util.*;
class loss
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,l;
l=0;
n=sc.nextInt();
while(n!=0)
{
n--;
int p,q,d,p1,p2;
p=sc.nextInt();
q=sc.nextInt();
d=sc.nextInt();
p1=p+(d*p)/100;
p2=p1-(d*p1)/100;
l=l+(q*(p-p2));
}
System.out.printf("%.9f",l);
}
}
}
