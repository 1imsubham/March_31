import java.util.*;
class socks
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j,s,m;
j=sc.nextInt();
s=sc.nextInt();
m=sc.nextInt();
m=m-j;
m=m/s;
if(m%2==0)
{
System.out.println("Lucky Chef");
}
else
{
System.out.println("Unlucky Chef");
}
}
}