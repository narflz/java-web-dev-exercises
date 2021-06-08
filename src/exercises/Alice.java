package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String wonderland = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice she " +
                "had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String searchable = wonderland.toUpperCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term: ");
        String term = input.next();
        String query = term.toUpperCase();
        boolean result = searchable.contains(query);
        Integer index = searchable.indexOf(query);
        Integer length = query.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String newWonderland = wonderland.replace(term, "");
        System.out.println(newWonderland);
    }
}
