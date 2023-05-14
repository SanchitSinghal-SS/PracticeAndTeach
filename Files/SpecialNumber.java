import java.util.*;
public class SpecialNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt(),num=n,sum=0;
     while(n!=0)
     {
        int digit  = n%10;
        int fact =1;
        for(int i=1;i<=digit;i++)
        {
            fact *=i;
        }
        sum = sum + fact;
        n/=10;
     }
if(sum==num)
System.out.println("Special Number");
else
System.out.println("Not a special number");
    }
}
