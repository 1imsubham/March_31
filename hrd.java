import java.util.*;
class hrd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,s=0;
float d=0;
char c;
a=sc.nextInt();
b=sc.nextInt();
c= c=sc.next().charAt(0);
while(b!=0)
{
if(c=='+')
{
s=a+b;
System.out.println(s);
}
if(c=='-')
{
s=a-b;
System.out.println(s);
}
if(c=='*')
{
s=a*b;
System.out.println(s);
}
if(c=='/')
{
d=a/b;
System.out.println(d);
}
}
}
}
