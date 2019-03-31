import java.util.*;
class sam
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,temp,k,sum;
temp=0;
k=0;
n=sc.nextInt();
temp=n/5;
k=temp+1;
sum=5*k;
if(n<38)
{
System.out.println(n);
}
else
if((sum-n)<3)
{
System.out.println(sum);
}
else
{
System.out.println(n);
}
}
}
}
