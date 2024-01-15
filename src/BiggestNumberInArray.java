import java.util.Arrays;
public class BiggestNumberInArray {
    public static int findBiggestNumberInArray(int[] arrayNum) {
        return Arrays.stream(arrayNum).max().orElseThrow();
    }
}
