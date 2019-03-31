import java.util.*;
class winning
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,a,b,k,j,c;
c=0;
n=sc.nextInt();
a=sc.nextInt();
b=sc.nextInt();
k=sc.nextInt();
for(j=1;j<=n;j++)
{
if(j%a==0 && j%b==0)
{
c++;
}
}
System.out.println(c);
}
}
}