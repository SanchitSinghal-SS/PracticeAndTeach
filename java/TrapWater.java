
public class TrapWater {
    public static void tw(int ar[])
    {
        int tw = 0;
        int n = ar.length;
        int lm[] = new int[n];
        int rm[] = new int[n];
        lm[0] = ar[0];
        rm[n-1] = ar[n-1];
        for(int i=1,j=n-2;i<n;i++,j--)
        {
            lm[i] = Math.max(lm[i-1],ar[i]);
            rm[j] = Math.max(rm[j+1],ar[j]);
        }
        for(int i=0;i<n;i++)
        {
            tw+=Math.min(lm[i],rm[i])-ar[i];
        }
        System.out.println(tw);
    }
    public static void main(String args[])
    {
        int i[] = {4,2,0,6,3,2,5};
        tw(i);
    }
}
