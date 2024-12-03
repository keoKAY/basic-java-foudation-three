package arraylesson;

import java.util.Arrays;
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
    }
}
