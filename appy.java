import java.util.*;
class appy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,a,b,k,i,c,d;
c=0;
d=0;
n=sc.nextInt();
a=sc.nextInt();
b=sc.nextInt();
k=sc.nextInt();
for(i=1;i<=n;i++)
{
if(i%a==0 && i%b==0)
{
}
else if(i%a==0)
{
c++;
}
else if(i%b==0)
{
d++;
}
}
if((c+d)>=k)
{
System.out.println("Win");
}
else
{
System.out.println("Lose");
}
}
}
}