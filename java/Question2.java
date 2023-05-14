import java.util.*;
public class Question2 {
    public static void main(String args[])
    {
        double sum = 0;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for series 1/a^2 + 3/a^4.... n terms  \nEnter 2 for series (1+2)^2 + (2+3)^2..... n terms");
        int c = sc.nextInt();
        
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        switch(c)
        {
            
            case 1:
            System.out.println("Enter value for a");
            int a = sc.nextInt(); 
            for(int i=1;i<=n;i++)
            {
                sum+= count/Math.pow(a,count+1);
                count +=2;
            }
            System.out.println("Sum of the series is: "+sum);
            break;
            case 2:
            for(int i=1;i<=n;i++)
            {
                sum += Math.pow(i+(i+1),2);
            }
             System.out.println("Sum of the series is: "+sum);
             break;
             default:
              System.out.println("Invalid choice");
        }
    }
}
