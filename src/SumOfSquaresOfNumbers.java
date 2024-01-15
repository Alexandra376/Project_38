import java.util.Arrays;
public class SumOfSquaresOfNumbers {
    public static int calculateSumOfSquares(int[] arrayNumbers) {
        return Arrays.stream(arrayNumbers).map(x -> x * x).sum();
    }

}
