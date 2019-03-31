import java.util.*;
class dcode
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,k,j;
n=sc.nextInt();
k=sc.nextInt();
if(n%2==0)
{
System.out.println((n-1)+" L");
}
else
{
System.out.println((n-1)+" Light");
}
}
}
}