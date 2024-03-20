import java.util.Arrays;

public class ArraysMerging {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int[] arr2 = { 10, 324, 45, 90, 9808 };

        int arrL = arr.length;
        int arr2L = arr2.length;

        int[] res = new int[arrL + arr2L];

        System.arraycopy(arr, 0, res, 0, arrL);
        System.arraycopy(arr2, 0, res, arrL, arr2L);

        System.out.println(Arrays.toString(res));
    }  
}
