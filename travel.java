import java.util.*;
class travel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int l,d,h;
l=sc.nextInt();
d=sc.nextInt();
h=sc.nextInt();
if((l*h)-d>=0)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}
}