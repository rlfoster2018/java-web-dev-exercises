package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] arrayName = {1, 1, 2, 3, 5, 8};

        /*for (int i: arrayName) {
            if (i%2 == 1) {
                System.out.println(i);
            }
            else {
                continue;
            }
        }*/

        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] seussSplit = seuss.split("\\.");
        System.out.println(Arrays.toString(seussSplit));

    }
}
