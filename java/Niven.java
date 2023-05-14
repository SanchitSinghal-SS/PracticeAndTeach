import java.util.*;

public class Niven {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(), num = n, sum=0;
        while(n!=0)
        {
            int dig = n%10;
            sum = sum+dig;
            n/=10;
        }
        if(num%sum == 0)
        System.out.println("Niven Number");
        else
        System.out.println("Not a niven number");
        sc.close();
    }
}
