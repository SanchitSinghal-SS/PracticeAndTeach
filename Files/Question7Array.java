import java.util.*;
class Question7Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, marks of Eng, maths and hindi for 20 students");
        String name[] = new String[20];
        int eng[] = new int[20];
        int math[] = new int[20];
        int hin[] = new int[20];
        double ag[] = new double[20];
        for(int i=0;i<20;i++)
        {
            name[i] = sc.nextLine();
            eng[i] = sc.nextInt();
            math[i] = sc.nextInt();
            hin[i] = sc.nextInt();
            ag[i] = (eng[i] + math[i] + hin[i])/3*100;
            if(ag[i] >= 60)
            System.out.println(name[i]+": Promotion granted");
        }

    }
}