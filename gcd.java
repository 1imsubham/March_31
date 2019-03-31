    import java.util.*;
    class Main 
    {
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    int t,i;
    t=sc.nextInt();
    for(i=0;i<t;i++)
    {
    long a,b,n,x,y;
    a=sc.nextLong();
    b=sc.nextLong();
    n=sc.nextLong();
    x=(long) Math.pow(a,n) + (long) Math.pow(b,n);
    if(a>b)
    {
    y=a-b;
    }
    else
    {
    y=b-a;
    }
    long gcd=1;
    for(int j=1; j<=x && j<=y;++j)
    {
    if(x%j==0 && y%j==0)
    gcd=j;
    }
    gcd=gcd%1000000007;
    System.out.println(gcd);
    }
    }
    } 