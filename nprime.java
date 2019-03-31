import java.util.Scanner;
class nprime
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int t,k;
t=sc.nextInt();
for(k=0;k<t;k++)
{		 
int n,i,count,c,sum;
sum=0;
i=3;
n=sc.nextInt();
for(count=2;count<=n+1;)
{
for(c=2;c<=i-1;c++)
{
if(i%c==0)
break;
}
if(c==i)
{
sum=sum+i;
count++;
}
i++;
}
System.out.println(sum%(1000000007));
}
}
}