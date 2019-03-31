import java.util.*;
class tria
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int n,c,j;
c=0;
j=1;
n=sc.nextInt();
while(n>0)
{
n=n-j;
if(n<0)
{
break;
}
else
{
j++;
c++;
}
}
System.out.println(c);
}
}
}