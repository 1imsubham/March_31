import java.util.*;
class ship
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
char c=sc.next().charAt(0);
switch(c)
{
case 'B':case 'b':
	{
	System.out.println("BattleShip");
	break;
	}
case 'C':case 'c':
	{
	System.out.println("Cruiser");
	break;
	}
case 'D':case 'd':
	{
	System.out.println("Destroyer");
	break;
	}
case 'F':case 'f':
	{
	System.out.println("Frigate");
	break;
	}
}
}
}
}
	