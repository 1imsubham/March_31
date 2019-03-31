import java.util.*;
class sorting
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j,i,n,temp,c;
c=0;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-1;j++)
{
if(a[j]>a[j+1])
{
c=c+1;
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("Array is sorted in "+c+" swaps.");
System.out.println("First Element: "+a[0]);
System.out.println("Last Element: "+a[n-1]);
}
}