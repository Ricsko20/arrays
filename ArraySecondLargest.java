public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        
        int max = Math.max(arr[0], arr[1]);
        int secondmax = Math.min(arr[0], arr[1]);
        
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }
        
        System.out.println(secondmax);     

    }
}
