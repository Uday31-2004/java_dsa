package programs;

import java.util.Scanner;

public class average {
    public static int calculateAverage(int n1, int n2, int n3) {
        return (n1+n2+n3)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Average:" + calculateAverage(n1, n2, n3));
    }
}
