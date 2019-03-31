import java.util.*;
class cake
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int i,c;
c=0;
int a[]=new int[100];
for(i=0;i<100;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<100;i++)
{
if(a[i]<=30)
{
c++;
}
}
if(c>=60)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
}