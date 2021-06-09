package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 5, 8};

        for (int i=0; i < nums.length; i++) {
            if (nums[i]%2!=0) {
                System.out.println(nums[i]);
            }
        }

        String rhyme = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = rhyme.split(" ");
        System.out.println(Arrays.toString(words));
        String[] sentences = rhyme.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
