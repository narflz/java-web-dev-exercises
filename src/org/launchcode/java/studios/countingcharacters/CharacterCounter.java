package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class CharacterCounter {
    public static void main(String[] args) {
        String sampleText = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics" +
                " into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String inputText = input.nextLine();

        String lilInputText = inputText.toLowerCase(); //make case insensitive

        String[] noNonAlphas = lilInputText.split("\\W+"); //eliminate non-alphabetic characters
        String finalText = new String();
        for (int i = 0; i < noNonAlphas.length; i++) {
            finalText = finalText + noNonAlphas[i];
        }

        char[] chars = finalText.toCharArray(); //generate a char array to utilize as keys for hashmap

        HashMap<Character, Integer> charMap = new HashMap<>(); //populates hash map with each char as a key and counts number of each to generate values
        for (Character character : chars) {
            Integer characterCount = charMap.get(character);
            if(characterCount == null) {
                characterCount = 0;
            }
            characterCount++;
            charMap.put(character, characterCount);
        }
        System.out.println(charMap);
    }

}
