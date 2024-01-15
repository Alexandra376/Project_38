import java.util.Arrays;
public class StringFromArray {
    public static String[] returnStringFromArray(String[] arrayString) {
        return Arrays.stream(arrayString)
                .filter(el -> el.length() > 5)
                .toArray(String[]::new);
    }
}
