import java.util.*;
class d
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    int a,i;
    long max;
    max=0;
    a=s.nextInt();
    for(i=1;i<a;i++)
    {
        long temp,sum,p,j;
	long res=1;
        for(j=1;j<=i;j++)
        {
            res=res*i;
        }
        temp=0;
        sum=0;
        while(res>0)
        {
            temp=res%10;
            sum+=temp;
            res=res/10;
        }
        if(sum>max)
        {
            max=sum;
        }
    }
    System.out.println(max);
}
}