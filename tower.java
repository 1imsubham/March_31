import java.util.*;
class tower
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
int n,i;
n=sc.nextInt();
char c[]=new char[n];
for(i=0;i<n;i++)
{
c[i]=sc.next().charAt(i);
}
if(n%2==0)
{
System.out.println(n/2);
}
else
{
System.out.println(n/2+1);
}
t--;
}
}
}
