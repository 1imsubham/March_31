import java.io.*;
class fancy
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int t,i;
t=Integer.parseInt(br.readLine());
for(i=0;i<t;i++)
{
String s;
s=br.readLine();
if(s.contains("not"))
{
System.out.println("Real Fancy");
}
else
{
System.out.println("regularly fancy");
}
}
}
}