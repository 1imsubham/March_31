import java.util.*;
class prmb
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t,i;
        t=s.nextInt();
        for(i=0;i<t;i++)
        {
            int n,j,k,c,max;
            max=0;
            c=0;
            n=s.nextInt();
            for(j=3;j<=n;j++)
            {
                if(n%j==0)
                {
                    for(k=1;k<=j;k++)
                    {
                        if(j%k==0)
                        {
                            c++;
                        }
                    }
                    if(c==2)
                    {
                        max=j;
                    }    
                }
            }
            System.out.println(max);
        }
    }
}