import java.util.*;
class wtch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int l;
String s;
s=sc.next();
char a[]=s.toCharArray();
l=a.length;
if(l%2==0)
{
System.out.println(l/2);
}
else
{
System.out.println((l/2)+1);
}
}
}
}