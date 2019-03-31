import java.util.*;
class Four
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,flag=0,rem;
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
if(rem==4)
{
flag++;
}
n=n/10;
}
System.out.println(flag);
}
}
}
