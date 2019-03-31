import java.util.*;
class Intest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,t,n,k,flag=0;
t=sc.nextInt();
k=sc.nextInt();
for(i=0;i<t;i++)
{
n=sc.nextInt();
if(n%k==0)
{
flag++;
}
}
System.out.println(flag);
}
}


