import java.util.*;
class special
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
while(t!=0)
{
t--;
int n,k,j,q,temp,c;
q=0;
temp=0;
c=0;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
Arrays.sort(a);
for(j=n-1;j>=0;j--)
{
b[q]=a[j];
q++;
}
temp=b[k-1];
for(j=0;j<n;j++)
{
if(b[j]>=temp)
{
c++;
}
}
System.out.println(c);
}
}
}