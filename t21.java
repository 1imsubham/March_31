import java.util.*;
class t21
{
public static void main(String args[])
{
int t,i;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(i=0;i<t;i++)
{
int m,n,r;
m=0;
n=0;
r=0;
m=sc.nextInt();
n=sc.nextInt();
r=(m*n)%3;
System.out.println(r);
}
}
}