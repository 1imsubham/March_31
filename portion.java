import java.util.*;
class portion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[4];
int i;
for(i=0;i<4;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
if((float)a[0]/a[1]==(float)a[2]/a[3])
{
System.out.println("Possible");
}
else
{
System.out.println("Impossible");
}
}
}
