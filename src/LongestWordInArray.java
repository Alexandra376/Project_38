import java.util.Arrays;
public class LongestWordInArray {
    public static String findLongestWordInArray(String[] arrayStr) {
        return Arrays.stream(arrayStr).max((s1, s2) -> Integer.compare(s1.length(), s2.length())).orElse(null);
    }
}
