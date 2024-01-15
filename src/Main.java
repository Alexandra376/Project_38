import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arrayNum = {10, 50, 40, 30, 20};
        int biggestNumber = BiggestNumberInArray.findBiggestNumberInArray(arrayNum);
        System.out.println("Biggest number in array is " + biggestNumber);

        String[] arrayStr = {"Goodbye", "love", "beautiful", "hey"};
        String longestWord = LongestWordInArray.findLongestWordInArray(arrayStr);
        System.out.println("Longest word is " + longestWord);

        String[] arrayString = {"Goodbye", "love", "beautiful", "hey"};
        String[] resultArray = StringFromArray.returnStringFromArray(arrayString);
        System.out.println("String whose length is greater than 5 " + Arrays.toString(resultArray));

        int[] arrayNumbers = {1, 2, 3, 4, 5};
        int sumOfSquares = SumOfSquaresOfNumbers.calculateSumOfSquares(arrayNumbers);
        System.out.println("Sum of squares of numbers are " + sumOfSquares);
    }
}
