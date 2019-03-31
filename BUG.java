import java.util.*;
class BUG
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,a,b,c,rem,i,j,l,l1;
t=sc.nextInt();
for(i=0;i<t;i++)
{
a=sc.nextInt();
b=sc.nextInt();
String number=String.valueOf(a);
l=number.length();
String number1=String.valueOf(b);
l1=number1.length();
int sum=0,x=0,y=0,big=0;
big=l;
if(l1>l)
{
big=l1;
}
else
{
big=l;
}
for(j=big;j>0;j--)
{
x=number.charAt(j-1);
y=number.charAt(j-1);
sum=((x+y)%10)*10 +sum;
}
System.out.println(sum%10);
}
}
}