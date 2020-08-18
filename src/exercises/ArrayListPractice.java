package exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListPractice {

    public static Integer sumOfAllEvens(int[] ballOfPoop) {
        int evenSum = 0;

        for (int i : ballOfPoop) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        return evenSum;
    }

    public static ArrayList<String> outNumbered(String[] inputArray) {
        Scanner input;
        int wordLength;
        input = new Scanner(System.in);
        System.out.println("Enter the word length desired (whole numbers only): ");
        wordLength = input.nextInt();

        ArrayList<String> outputArray = new ArrayList<>();
        for (String i : inputArray) {
            if (i.length() == wordLength) {
                outputArray.add(i);
            }
        }
        return outputArray;
    }

        public static void main (String[]args){

            int[] intArray = {1, 1, 2, 3, 5, 8, 2, 3, 6, 9}; //even sum = 18
            String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
            String[] seussSplit = seuss.split(" ");

            //System.out.println(sumOfAllEvens(intArray));
            System.out.println(outNumbered(seussSplit));
        }
    }