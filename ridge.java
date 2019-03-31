import java.util.*;
class ridge
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,x,y,i;
x=1;
y=1;
n=sc.nextInt();
for(i=1;i<=n;i++)
{
y=y*2;
}
System.out.println(x+" "+y);
}
}
}
