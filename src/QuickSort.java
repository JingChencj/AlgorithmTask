/**
 * Created by Jessica on 2016/11/30.
 */

/**
 * Purpose: quick sort
 * Input:
 * Output:
 */
public class QuickSort {

    /**
     *
     * @param arr
     * @param low
     * @param high
     */
    public static void Quick_Sort(int[] arr, int low, int high){

        int p; // position of partition element

        if (low < high){
            p = high+1;
            p = PARTITION(arr, low,p);
            Quick_Sort(arr, low, p-1);
            Quick_Sort(arr, p+1, high);
        }
    }

    /**
     *
     * @param arr
     * @param m
     * @param p
     */
    private static int PARTITION(int[] arr, int m, int p) {
        int i = m,v,temp;
        v = arr[m];

        while (i < p){
            do {
                i = i+1;
            }
            while (i < p-1 && arr[i] < v);
            do {
                p = p-1;
            }
            while (arr[p] > v);
            if (i < p){
                temp = i;
                i = p;
                p = temp;
            }
        }
        arr[m] = arr[p];
        arr[p] = v;
        return p;

    }

    public static void main(String[] args) {

        int[] arr = new int[]{2,-5,0,2,1,45,23,55};
        int[] arr2 = new int[]{2,-5,0,2,1,45,23,55};
        int[] arr3 = new int[]{2,-5,0,2,1,45,23,55};

        Quick_Sort(arr, 0, arr.length-1);
        Quick_Sort(arr2, 0, arr2.length);
        Quick_Sort(arr3, 0, arr3.length);

        System.out.println("数组1：" + arr);
        System.out.println("数组1：" + arr2);
        System.out.println("数组1：" + arr3);
    }
}
