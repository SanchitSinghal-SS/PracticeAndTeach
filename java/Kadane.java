public class Kadane {
    public static int kadane(int numbers[])
    {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            cs = cs + numbers[i];
            if(cs<0)
            cs = 0;
            ms = Math.max(cs,ms);
        }
        return ms;
    }
    public static void main(String args[])
    {
        int numbers[] = {2,5,6,-1,0,-9};
        System.out.println(kadane(numbers));
    }
}
