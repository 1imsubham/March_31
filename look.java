import java.util.*;
class look
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,k,i,j;
n=sc.nextInt();
k=sc.nextInt();
long a[]=new long[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<k;i++)
{
int max = Collections.max(Arrays.asList(a)); 
for(j=0;j<n;j++)
{
a[j]=max-a[j];
}
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}
