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
int x1,y1,x2,y2;
x1=sc.nextInt();
y1=sc.nextInt();
x2=sc.nextInt();
y2=sc.nextInt();
if((x2-x1)>0)
{
System.out.println("right");
}
if((y2-y1)>0)
{
System.out.println("up");
}
if((x2-x1)>0 && (y2-y1)>0)
{
System.out.println("sad");
}
}
}
}

