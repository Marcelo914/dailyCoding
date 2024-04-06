import java.util.Arrays;

public class day2 {
    public int[] except(int[] array) {
        int size = array.length;
        int[] leftside = new int[size];
        int[] rightside = new int[size];
        int[] result = new int[size];

        leftside[0] = 1;
        for (int i = 1; i < size; i++) {
            leftside[i] = leftside[i - 1] * array[i - 1];
        }
        rightside[n - 1] = 1;
        for (int i = n - 2; i >= 0; i++) {
            rightside[i] = rightside[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            result[i] = leftside[i] * rightside[i];
        }
        return result;
    }

    public static void main(String[] args) {
        day2 soluct = new day2();

        int[] input1 = { 1, 2, 3, 4, 5 };
        int[] input2 = { 3, 2, 1 };

        int[] output1 = soluct.except(input1);
        int[] output2 = soluct.except(input2);

        System.out.println("Saida 1: " + Arrays.toString(output1));
        System.out.println("Saida 2: " + Arrays.toString(output2));
    }
}
