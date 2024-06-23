// This problem was asked by Stripe.

// Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the
// lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
// For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

// You can modify the input array in-place.
import java.util.Arrays;

public class day4 {

    // organiza o array em ordem crescente
    public static int[] bubblesort(int[] input) {
        int size = input.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
        }
        return input;
    }

    public static int[] removeNegatives(int[] input) {
        return Arrays.stream(input).filter(x -> x >= 0).toArray();
    }

    public static int findMissing(int[] input) {
        int size = input.length;
        int missing = 1;
        for (int i = 0; i < size; i++) {
            if (input[i] == missing) {
                missing++;
            }
        }
        return missing;
    }

    public static void mostrarArray(int[] input) {
        System.out.println("Array ordenao");

        for (int i : input) {
            System.out.println(i + "\n");
        }
    }

    public static void main(String[] args) {
        int[] input = { 3, 4, -1, 1 };

        int[] positiveArray = removeNegatives(input);

        int[] array = bubblesort(positiveArray);

        int missingNumber = findMissing(array);

        System.out.println("O número faltando é: " + missingNumber);
    }
}
