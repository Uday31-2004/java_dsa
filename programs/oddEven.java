package programs;

import java.util.Scanner;

public class oddEven {
    
    public static int checkOddEven(int num) {
        if (num % 2 == 0){
            return 1; // even number
        } else{
            return 0; // odd number
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number");
        int num =  sc.nextInt();
        int result = checkOddEven(num);
        if (result==1) {
            System.out.println("The given number is Even.");
        }else {
            System.out.println("The given number is odd.") ;
        }
    }
}
