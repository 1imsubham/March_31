import java.util.*;
class calc
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
double a,b;
double c=0;
char ch;
a=sc.nextDouble();
b=sc.nextDouble();
ch=sc.next().charAt(0);
switch(ch)
{
case '+':c=a+b;break;
case '-':c=a-b;break;
case '*':c=a*b;break;
case '/':c=a/b;break;
}
System.out.println(c);
}
}