import java.util.*;
class steel
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int q,i;
q=sc.nextInt();
for(i=0;i<q;i++)
{
int h,t;
double c;
h=sc.nextInt();
c=sc.nextDouble();
t=sc.nextInt();
if(h>50 & c<0.7 & t>5600)
{
System.out.println("10");
}
else if(h>50 & c<0.7)
{
System.out.println("9");
}
else if(c<0.7 & t>5600)
{
System.out.println("8");
}
else if(h>50 & t>5600)
{
System.out.println("7");
}
else if(h>50 || c<0.7 || t>5600)
{
System.out.println("6");
}
else
{
System.out.println("5");
}
}
}
}
