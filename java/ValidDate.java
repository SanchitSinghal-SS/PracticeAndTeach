import java.util.*;
class ValidDate {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day, month and year");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        boolean flag = true;
        if (m < 1 || m > 12)
            flag = false;
        if (d < 1 || d > 31)
           flag = false;
        if (m == 2) {
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            {
                if(d>29)
                flag = false;
            }
            else if(d>28)
            flag = false; 
        }

        if (m == 4 || m == 6 || m == 9 || m == 11)
          if(d > 30)
          flag = false;
  if(flag == false)
  System.out.println("Invalid Date");
  else
  System.out.println("Valid Date");
    }
}