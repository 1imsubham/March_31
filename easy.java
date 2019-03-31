import java.util.*;
class easy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,c;
n=sc.nextInt();
c=0;
while(n!=0)
{
n--;
int a,i;
a=0;
a=sc.nextInt();
for(i=1;i<=a;i++)
{
if(i%2!=0)
{
c++;
}
}
}
System.out.println(c);
}
}
}