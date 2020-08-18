package org.launchcode.java.studios.countingcharacters;

public class CountingCharacters {

    public static void main(String[] args) {

        String inputString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you have done that, it is pretty straightforward from there.";
        //String inputString = "Someone pooped my pants.";

        int count[] = new int[256];  // I used ASCII as a universal reference

        int inputLength = inputString.length();

        for (int i = 0; i < inputLength; i++) {
            count[inputString.charAt(i)]++;
        }

        char outPutArray[] = new char[inputLength];

        for (int i = 0; i < inputLength; i++) {
            outPutArray[i] = inputString.charAt(i);
            int trigger = 0;

            for (int j = 0; j <=i; j++) {
                if (inputString.charAt(i) == outPutArray[j]) {
                    trigger ++;
                }
            }

            if (trigger == 1) {
                System.out.println(inputString.charAt(i) + ": " + count[inputString.charAt(i)]);
            }
        }

        }

    }
