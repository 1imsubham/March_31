import java.util.*;
class Candy123
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,a,b,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
a=sc.nextInt();
b=sc.nextInt();
if(a%2==0)
{
System.out.println("Limak");
}
else
{
System.out.println("Bob");
}
}
}
}