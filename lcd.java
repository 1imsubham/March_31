import java.util.*;
class lcd
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int a,b;
a=sc.nextInt();
b=sc.nextInt();
int gcd = 1;
for(int j=1;j<=a && j<=b;++j)
        {
            if(a%j==0 && b%j==0)
                gcd=j;
        }
int lcm=(a*b)/gcd;
System.out.println(gcd+" "+lcm);
}
}
}