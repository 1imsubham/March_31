import java.util.*;
class lost
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,k;
n=sc.nextInt();
k=sc.nextInt();
n=n%k;
System.out.println(n);
}
}
}