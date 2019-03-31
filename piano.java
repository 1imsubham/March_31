import java.util.*;
class piano
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
String s;
s=sc.next();
char a[]=s.toCharArray();
int l,i,c;
c=0;
l=a.length;
for(i=0;i<l;i=i+2)
{
if(a[i]=='A' && a[i+1]=='B' || a[i]=='B' && a[i+1]=='A')
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
t--;
}
}
}