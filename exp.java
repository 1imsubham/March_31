import java.util.*;
class exp
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int q,p;
double total;
q=sc.nextInt();
p=sc.nextInt();
if(q>1000)
{
total=(q*p)-((10*q*p)/100);
}
else
{
total=q*p;
}
System.out.printf("%.6f",total);
}
}
} 