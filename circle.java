import java.util.*;
class circle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
double k,kc;
k=0;
k=sc.nextDouble();
int temp,x,c=0;
temp=0;
temp=(int)k;
kc=Math.sqrt(k);
x=(int)kc;
temp=temp-(x*x);
System.out.println("Integer value"+temp);
System.out.println("square root"+kc);
System.out.println("square root value in int"+x);
System.out.println("temp = "+temp);
/*for(i=k;i>=1;i--)
{
if((k/i)==i)
{
c++;
k=k-(i*i);
}
}
System.out.println(c);*/
}
}
}
