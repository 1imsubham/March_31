import java.util.*;
class fib
{
    public static void main(String args[])
    {
    int n;
    Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
    if(n%4==0)
    {
        n=n+1;
    }
    else
    {
        n=n-1;
    }
    System.out.println(n);
}
}
