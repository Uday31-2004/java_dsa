package programs;

import java.util.Scanner;

//Write a function to print the sum of all odd numbers from 1 to n.
public class sumOdd {
    public static int findSumOfOdds(int n) {
        if (n <= 0)
            return -1; //
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Sum of Odd Numbers from 1 to " + num + " is : " + findSumOfOdds(num));
    }
}
