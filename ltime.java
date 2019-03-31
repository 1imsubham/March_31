import java.util.*;
class ltime
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t,i;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            int n,j;
            n=sc.nextInt();
            for(j=1;j<(n*n);j++)
            {
                if(j%n==0)
                {
                    System.out.print(j+"\n");
                }
                else
                {
                    System.out.print(j+"\t");
                }
            }
        }
    }
}