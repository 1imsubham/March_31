import java.util.*;
class mam
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
while(t!=0)
{
t--;
int n,k,s,m;
s=0;
m=0;
n=sc.nextInt();
k=sc.nextInt();
s=n/k;
m=n%k;
System.out.println(s+""+m);
}
}
}





