package programs;

import java.util.Scanner;

public class primeNum {

    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (checkPrime(num)) {
            System.out.println("The number is a Prime Number");
        } else {
            System.out.println("The number is not a Prime Number");
        }
    }
}
