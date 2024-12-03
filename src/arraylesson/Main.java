package arraylesson;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n; // number of student
        System.out.println("Enter the number of student : ");
        n = scanner.nextInt();

        // int scores = new int[1];
        int[] scores = new int[n];

        // input score for all the student
        // 5 elements -> 0 , 1, 2 ,.., last element = (length -1 )
        for (int i = 0; i < n; i++) {
            System.out.println("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // print all values of scores
        System.out.println("All Scores: ");
        System.out.println(Arrays.toString(scores));
        System.out.println("All even scores: ");
        for (int num : scores) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nAll odd scores: ");
        for (int num : scores) {
            if (num % 2 == 0) continue;
            System.out.print(num + " ");
        }
        System.out.println();

        // find sum
        // 11,33,44,55
        int sum = 0;
        for (int num : scores) {
            // assignment operator
            //sum += num;
            sum = sum + num;
        }
        System.out.println("Total Score : " + sum);
        // find avg
        float avg = sum / (float) n;
        System.out.println("Average is : " + avg);

        // finding the max/min values of the array
        int max = scores[0];
        for( int i = 1; i < n; i++ ) {
            if(scores[i] > max) max = scores[i];
        }
        System.out.println("Max is : " + max);
        // sort ( bubble sort , built-in sorts ( TimSort, Dual-pivot quick sort )

        // Sort ( small -> large ( ASC ) , large -> small (DESC)
        Arrays.sort(scores); // primitive , object
        System.out.println("Final Scores: ");
        System.out.println(Arrays.toString(scores));
//        Arrays.sort(scores, Collections.reverseOrder());

        // remove element
        // search for element ( linear search , binary search )
    }
}
