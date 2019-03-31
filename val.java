import java.util.*;
class val
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
char c;
int val;
val=0;
c=sc.next().charAt(0);
val=c;
System.out.println(val-97);
t--;
}
}
}