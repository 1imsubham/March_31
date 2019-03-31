import java.util.*;
class three
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int x,y,z;
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
if(x==y && y==z && z==x)
{
System.out.println("no");
}
else
{
System.out.println("yes");
}
}
}
}