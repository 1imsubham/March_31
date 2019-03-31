import java.util.*;
import java.lang.*;
class name
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
sc.nextLine();
for(i=0;i<t;i++)
{
String n;
n=sc.nextLine();
String upper="";
upper=Character.toUpperCase(n.charAt(0)) + n.substring(1);
System.out.println(upper);
}
}
}
