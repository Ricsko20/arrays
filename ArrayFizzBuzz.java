public class ArrayFizzBuzz {
    public static void main(String[] args) {
        String[] array = new String[101];
        int row = 0;

        for(int i = 1; i < array.length; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                array[i] = "FizzBuzz, ";
            }
            else if(i % 5 == 0) {
                array[i] = "Buzz, ";
            }
            else if(i % 3 == 0) {
                array[i] = "Fizz, ";
            }
            else {
                array[i] = Integer.toString(i) + ", ";
            }
        }

        for(int i = 1; i < array.length; i++) {
            System.out.print(array[i]);
    
            if(i == 15 || i == 30 || i == 45 || i == 60 || i == 75 || i == 90) {
                System.out.print("\n");
            }    
        }
    }
}
