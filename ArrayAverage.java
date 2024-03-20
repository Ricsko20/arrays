public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        double osszeg = 0;

        for(int i = 0; i < arr.length; i++) {
            osszeg += arr[i];
        }

        double atlag = osszeg / arr.length;

        System.out.println(atlag);
    }
}
