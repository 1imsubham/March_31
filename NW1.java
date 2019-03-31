import java.util.*;
class NW1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n;
String d;
n=sc.nextInt();
d=sc.next();
if(n==28)
{
System.out.println("4 4 4 4 4 4 4");
}
if(n%7==1)
{
if(d==mon)
{
System.out.println("5 4 4 4 4 4 4");
}
if(d=="tue")
{
System.out.println("4 5 4 4 4 4 4");
}
if(d=="wed")
{
System.out.println("4 4 5 4 4 4 4");
}
if(d=="thu")
{
System.out.println("4 4 4 5 4 4 4");
}
if(d=="fri")
{
System.out.println("4 4 4 4 5 4 4");
}
if(d=="sat")
{
System.out.println("4 4 4 4 4 5 4");
}
if(d=="sun")
{
System.out.println("4 4 4 4 4 4 5");
}
}
if(n%7==2)
{
if(d=="mon")
{
System.out.println("5 5 4 4 4 4 4");
}
if(d=="tue")
{
System.out.println("4 5 5 4 4 4 4");
}
if(d=="wed")
{
System.out.println("4 4 5 5 4 4 4");
}
if(d=="thu")
{
System.out.println("4 4 4 5 5 4 4");
}
if(d=="fri")
{
System.out.println("4 4 4 4 5 5 4");
}
if(d=="sat")
{
System.out.println("4 4 4 4 4 5 5");
}
if(d=="sun")
{
System.out.println("5 4 4 4 4 4 5");
}
}
}
}
}