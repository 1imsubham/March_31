import java.util.*;
class characters
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s;
s=sc.next();
char[] ele = s.toCharArray();
Arrays.sort(ele);
String elesort=new String(ele);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
String input;
input=sc.next();
char[] charArray = input.toCharArray();
Arrays.sort(charArray);
String sortedstring = new String(charArray);
if(sortedstring.contains(elesort))
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}
} 