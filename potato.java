import java.util.*;
class potato
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int x,y,sum,z,count,j,k,d;
sum=0;
d=0;
z=0;
x=sc.nextInt();
y=sc.nextInt();
sum=x+y;
for(j=sum;j<=100;j++)
  {
    count=0;
    for (k=2;k<=j/2;k++)
    {
  	if(j%i==0)
  	{
     	  count++;
  	  break;
	}
    }
    if(count==0 && j!=1)
    {
    	z=j;
	break;
    }
  }
d=z-sum;
System.out.println(d);
}
}
}

  

