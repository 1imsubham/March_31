import java.util.*;
class quick
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[4];
int i,x;
for(i=0;i<4;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
x=a[0]+a[1]+a[2];
if(x==a[3])
{
System.out.println("1");
}
else
{
System.out.println("0");
}
}
}