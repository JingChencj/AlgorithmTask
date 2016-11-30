/**
 * Created by Jessica on 2016/11/30.
 */

/**
 * Propose: get max value in array recursively
 * Input: an array with integers
 * Output: index of max value in this array
 */
public class MAX {



    public static void main(String args[]){

        double[] arr = new double[]{1,3,0,-1,8.4,0.1,100,9724354};
        double[] arr2 = new double[]{1,0.9999999999999,8.4,0.1,100,9724.88888888888};
        double[] arr3 = new double[]{1,3,0,0.8,9724354,9724354};

        int i = 0;
        int i2 = 0;
        int i3 = 0;

        i = Max(i, arr);
        i2 = Max(i2, arr2);
        i3 = Max(i3, arr3);

        System.out.println("最大值为：" + arr[i] + "是数组中的第" + (i+1) + "位");
        System.out.println("最大值为：" + arr2[i2] + "是数组中的第" + (i2+1) + "位");
        System.out.println("最大值为：" + arr3[i3] + "是数组中的第" + (i3+1) + "位");
    }

    public static int Max(int i, double[] arr) {
        int n=arr.length,j,k=0;
        if (i < n){
            j = Max(i+1, arr);
            if (arr[i] > arr[j])
                k = i;
            else
                k = j;
        }
        return k;
    }

}
