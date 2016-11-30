/**
 * Created by Jessica on 2016/11/30.
 */

/**
 * Purpose: binary search got sorted array
 * Input: A,n,x,j
 * Output: search value
 */
public class BINSRCH {

    /**
     *
     * @param arr unsorted array
     * @param x
     */
    public static int BinSearch(int[] arr, int x){

        int low, high, mid, j = 0;

        low = 0;
        high = arr.length-1;

        while (low <= high){
            mid = (low + high)/2;
            if (x < arr[mid])
                high = mid-1;
            else if (x > arr[mid])
                low = mid+1;
            else
            {
                j = mid;
                break;}
        }

        return arr[j];
    }

    public static void main(String[] args) {

        System.out.println("最终找到的元素是："+ BinSearch(new int[]{1,1,2,4,8,10,12,15},8));
    }
}
