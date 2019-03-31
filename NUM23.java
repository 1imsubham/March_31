import java.util.*;
class NUM23
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			int count = 0;
			
			for(int i=l; i<=r; i++) {
				int digit = i%10;
				if(digit==2 || digit==3 || digit==9) {
					count++;
				}
			}
			System.out.println(count);
			t--;
		}
	}
}