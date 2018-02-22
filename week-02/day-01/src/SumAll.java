// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`

public class SumAll {
    public static void main(String[] args) {
        int[] ai = {3,4,5,6,7};
        int numberOfElements = ai.length;
        int sum = 0;
        for (int i = 0; i < numberOfElements; i++) {
            sum = sum + ai[i];
        }
        System.out.println(sum);
    }
}