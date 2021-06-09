package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(5);
        numbers.add(6);
        numbers.add(79);
        numbers.add(101);
        numbers.add(0);
        numbers.add(22222);
        numbers.add(42);
        numbers.add(4);
        numbers.add(123456789);

        String rhyme = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String words[] = rhyme.split(" ");
        List<String> wordList = new ArrayList<String>();
        wordList = Arrays.asList(words);

        System.out.println(fiveLetterWords(wordList));

        System.out.println(sumEven(numbers));
    }

    public static int sumEven(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static ArrayList<String> fiveLetterWords(List<String> words) {
        ArrayList<String> fiveLetterList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        for (String i : words) {
            if (i.length()==numChars) {
                fiveLetterList.add(i);
            }
        }
        return fiveLetterList;
    }
}
