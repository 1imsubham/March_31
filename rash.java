import java.util.*;
class rash
{
public static void man(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int a,j;
a=sc.nextInt();
char l[]=new char[a];  
for(j=0;j<a;j++)
{
l[j]=sc.nextChar();
}
int b;
b=sc.nextInt();
char k[]=new Char[b];  
for(j=0;j<b;j++)
{
k[j]=sc.nextChar();
}
int c;
c=sc.nextInt();
char p[]=new Char[c];  
for(j=0;j<c;j++)
{
p[j]=sc.nextChar();
}
int d;
d=sc.nextInt();
char q[]=new int[d];  
for(j=0;j<d;j++)
{
q[j]=sc.nextChar();
}
String s1=new String(l);
String s2=new String(k);
String s3=new String(p);
String s4=new String(q);
if(s1.contains(s3) && s2.contains(s4))
{
System.out.println("yes");
}
else
{
System.out.println("yes");
}
}
}
}