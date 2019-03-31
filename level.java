import java.util.*;
class level
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,j;
n=sc.nextInt();
for(i=0;i<n;i++)
{
int a[]=new int[5];
int flag=0;
for(j=0;j<5;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<5;j++)
{
if(a[j]==1)
{
flag++;
}
}
if(flag==0)
{
System.out.println("Beginner");
}
else if(flag==1)
{
System.out.println("Junior Developer");
}
else if(flag==2)
{
System.out.println("Middle Developer");
}
else if(flag==3)
{
System.out.println("Senior Developer");
}
else if(flag==4)
{
System.out.println("Hacker");
}
else
{
System.out.println("Jeff Dean");
}
}
}
}


