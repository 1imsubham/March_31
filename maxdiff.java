import java.util.*;
class maxdiff
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,k,i,boy,man;
boy=0;
man=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(i=0;i<n;i++)
{
if(i<k)
{
boy=boy+a[i];
}
else
{
man=man+a[i];
}
}
System.out.println(man-boy);
}
}
}