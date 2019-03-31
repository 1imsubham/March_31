import java.util.*;
class Flow013
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,a,b,c,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a+b+c)==180)
{
System.out.println("YEAH");
System.out.println("MAHAN LADKA");
}
else
{
System.out.println("NOPE");
}
}
}
}