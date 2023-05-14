import java.util.*;

public class Question5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[20];
        int s = 0, l = arr.length - 1;
        boolean flag = false;
        System.out.println("Enter twenty words in sorted form ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("Enter a word to search");
        String word = sc.nextLine();
        while (s <= l) {
            int mid = (s + l) / 2;
            if (word.compareTo(arr[mid]) == 0) {
                System.out.println("Element Found at index: " + mid);
                flag = true;
                break;
            }
            if (word.compareTo(arr[mid]) > 0)
                s = mid + 1;
            else if (word.compareTo(arr[mid]) < 0)
                l = mid - 1;
        }
        if(flag==false)
        System.out.println("Element cannot be found");
    }
}
