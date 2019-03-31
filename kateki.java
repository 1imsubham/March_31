import java.io.*;
class kateki
{
public static void main(String args[])throws Exception
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t = Integer.parseInt(br.readLine());
int j;
for(j=0;j<t;j++)
{
int n = Integer.parseInt(br.readLine());
String s= br.readLine();
char c[] = s.toCharArray();
int count=0;
int i=0;
while(i <(n-1))
{
if(((c[i] == 'B') && (c[i+1]== 'R')) || ((c[i] == 'R') && (c[i+1]== 'B')))
{
count++;
i=i+2;
}
else
i++;
}
System.out.println(count);
}
}
}