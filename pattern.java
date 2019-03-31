import java.util.*;
class pattern
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,j;
t=sc.nextInt();
for(j=0;j<t;j++)
{
int l,i,c;
c=0;
String s;
s=sc.next();
l=s.length();
for(i=0;i<l;i=i+2)
{
if(s.charAt(i)=='A' && s.charAt(i+1)=='B' || s.charAt(i)=='B' && s.charAt(i+1)=='A')
{
c++;
}
}
if(c==(l/2))
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