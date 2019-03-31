import java.util.*;
class match
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,j,a,b;
a=1;
b=0;
n=sc.nextInt();
String s=new String[n];
for(j=0;j<n;j++)
{
s[j]=in.nextLine();
}
for(j=0;j<n-1;j++)
{
if(s[j]==s[j+1])
{
String x=s[j];
a=a+1;
}
else
{
String y=s[j+1]; 
b=b+1;
}
}
if(a==b)
{
System.out.println("Draw");
}
if(a>b)
{
System.out.println(x);
}
if(b>a)
{
System.out.println(y);
}
}
}
}