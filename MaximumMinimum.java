import java.util.Arrays;

public class MaximumMinimum {
    public static void main(String[] args) {

        int[] numbers = {5, 34, 78, 2, 45, 1, 99, 23};
        int minimumNumber = min(numbers);
        int maximumNumber = max(numbers);
        System.out.println("Minimum number: " + minimumNumber);
        System.out.println("Maximum number: " + maximumNumber);
    }

    public static int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }
  
    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
