import java.util.*;

class chef

{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);

int i,t;

t=sc.nextInt();

for(i=0;i<t;i++)

{

int a,b,min,max;
min=0;
max=0;
a=sc.nextInt();

b=sc.nextInt();
max=a+b;

if(a>b)

{


min=a;
}

else

{
min=b;
}

System.out.println(min+" "+max);

}

}

}
