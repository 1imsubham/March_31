import java.util.*;
class solve
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t,i;
t=sc.nextInt();
for(i=0;i<t;i++)
{
int jaf,j,n,o,g,h,b;
n=0;
o=0;
jaf=sc.nextInt();
int day1[]=new int[jaf];
int prb1[]=new int[jaf];
for(j=0;j<jaf;j++)
{
day1[j]=sc.nextInt();
prb1[j]=sc.nextInt();
}
int yal,k;
yal=sc.nextInt();
int day2[]=new int[yal];
int prb2[]=new int[yal];
for(k=0;k<yal;k++)
{
day2[k]=sc.nextInt();
prb2[k]=sc.nextInt();
}
int l;
for(b=0;b<yal;b++)
{
h=0;
g=0;
n=day1[0];
for(l=0;l<=yal-1;l++)
{
if(day2[l]<=n)
{
h++;
}
n+=day1[l+1]-day1[l];
}
for(l=0;l<yal;l++)
{
o=o+prb1[l];
if(prb2[l]<=o)
{
g++;
}
}
if(h==1 && g==1)
{
System.out.println("Go Sleep");
}
else
{
System.out.println("Go Camp");
}
}
}
}
}

