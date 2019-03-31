import java.util.*;
class NUM23
{
public static void main (String[] args)
{
Scanner sc= new Scanner(System.in);
int t,l,r,i;
t = sc.nextInt();
while(t>0) 
{
l = sc.nextInt();
r = sc.nextInt();
int c=0;
for(i=l; i<=r; i++) 
{
int rem;
rem=i%10;
if(rem==2 || rem==3 || rem==9) 
{
c++;
}
}
System.out.println(c);
t--;
}
}
}