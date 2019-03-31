import java.util.*;
import java.util.Arrays; 
import java.util.Collections; 
public class pre 
{ 
    public static void main(String[] args) 
    {  
	int n,i;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
        Integer arr[]=new Integer[n];
	for(i=0;i<n;i++)
	{
	arr[i]=sc.nextInt(); 
  	}
        Arrays.sort(arr, Collections.reverseOrder()); 
  	System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr)); 
    } 
} 