import java.util.*;
class cinema
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
int n;
n=sc.nextInt();
if(n%2==0)
{
System.out.println(n);
}
else
{
System.out.println(n-1);
}
t--;
}
}
}