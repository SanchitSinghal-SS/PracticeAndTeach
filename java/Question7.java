public class Question7 {
    public static void main(String args[]) {
        for (int i = 101; i <= 200; i++) {
            int c = 0, num = i;
            while (num != 0) {
                int digit = num % 10;
                if (digit == 0)
                    c++;
                num /= 10;
            }
            if (c == 0)
                System.out.print(i + " ");
        }
    }
}
