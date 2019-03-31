import java.util.*;
import java.lang.*;
import java.io.*;
class gfg
 {
	public static void main (String[] args)throws IOException
	 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int t;
	 t=Integer.parseInt(br.readLine());
	 while(t!=0)
	 {
	     int a,b,n,r;
	     a=0;
	     b=0;
	     n=0;
	     r=0; 
	     a=Integer.parseInt(br.readLine());
	     b=Integer.parseInt(br.readLine());
	     n=Integer.parseInt(br.readLine());
	     System.out.println(a+"  "+b+"  "+n);
	 }
	 }
}