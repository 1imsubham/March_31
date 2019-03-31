import java.util.*;
class race
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,j,min,m;
min=0;
m=0;
n=sc.nextInt();
int s[]=new int[n];
for(j=0;j<n;j++)
{
s[j]=sc.nextInt();
}
Arrays.sort(s);
min=s[1]-s[0];
for(j=1;j<n-1;j++)
{
m=s[j+1]-s[j];
if(m<min)
{
min=m;
}
}
System.out.println(min);
}
}
}
