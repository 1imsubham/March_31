import java.util.*;
public class actor 
{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=input.nextInt();
    int factors;
    for(int i=1;i<num;i++)
    {
        factors=num%i;
        if(factors==0 && isPrime(factors))
        System.out.println(i+"");
    }
    input.close();
}
public static boolean isPrime(int n)
{
    boolean prime=true;
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        {
            prime=false;
            break;
        }

    }
    return prime;
}

}