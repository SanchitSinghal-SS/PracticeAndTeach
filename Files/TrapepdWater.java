/* 1) Min numebr of bars for trapping water >2 
   2) Ascending and Descending bars cannot trap water
*/
public class TrapepdWater {
    public static void tw(int arr[])
    {
        int twater = 0;
        int n = arr.length;
        int leftMax[]  = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];
        for(int i=1, j = n-2;i <n;i++, j--)
        {
              leftMax[i] = Math.max(arr[i], leftMax[i-1]);
              rightMax[j] = Math.max(arr[j] , rightMax[j+1]);
        }
        for(int i=0;i<n;i++)
        {
            twater += Math.min(leftMax[i], rightMax[i]) - arr[i]; 
        }
        System.out.println(twater);

    }
    public static void main(String args[])
    {
       int arr[] = {4,2,0,6,3,2,5};
       tw(arr);
    }
}
