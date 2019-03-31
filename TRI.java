import java.util.*;
class TRI
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i,x,s,c;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n=sc.nextInt();
x=1;
s=0;
c=0;
while(s!=n)
{
s=s+x;
x++;
c++;
}
System.out.println(c);
}
}
}