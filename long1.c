include<stdio.h>
int main()
{
    int test;
    scanf("%d",&test);
    while(test--)
    {
        int n,a,b,k;
        int c=0,d=0,e=0,f=0;
        scanf("%d%d%d%d",&n,&a,&b,&k);
        c=n/a;
        d=n/b;
        int h=a>b?a:b;
        int l=a>b?b:a;
        e=n/(a*b);
        f=c+d-(2*e);
        if(h%l==0){
        if((n/l)-(n/h)>=k)
        {
            printf("Win\n");
        }
        else
        {
            printf("Lose\n");
        }
        }
        else
        {
            if(f>=k)
        {
            printf("Win\n");
        }
        else
        {
            printf("Lose\n");
        }
        }
 //printf("a=%d..b=%d..c=%d..d=%d..e=%d..f=%d",a,b,c,d,e,f);
    }
    return 0;
}
