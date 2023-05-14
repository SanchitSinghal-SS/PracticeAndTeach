import java.util.*;
public class Question4
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string");
      String s = sc.nextLine(),us = "";
    for(int i=0;i<s.length();i++)
    {
        char ch = s.charAt(i);
        if(ch=='A' || ch=='a'|| ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
        us = us+"*";
        else if(Character.isDigit(ch))
        us = us+"?";
        else
        us = us + ch;
    }
    System.out.println("Changed String is: "+us);
    }
}