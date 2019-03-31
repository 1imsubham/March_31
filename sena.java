import java.util.*;
class sena
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int n,i;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int e,o;
e=0;
o=0;
for(i=0;i<n;i++)
{
if(a[i]%2==0)
{
e=e+1;
}
else
{
o=o+1;
}
}
if(e>o)
{
System.out.println("READY FOR BATTLE");
}
if(o>e || o==e)
{
System.out.println("NOT READY");
}
}
}