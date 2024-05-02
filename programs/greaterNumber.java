package programs;
//Write a function which takes in 2 numbers and returns the greater of those two
import java.util.Scanner;

public class greaterNumber {
    
    public static boolean greater(int n1, int n2) {
        if (n1 > n2) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the first number: ");
        int num1 = sc.nextInt(); 
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();  
        boolean result = greater(num1, num2);
        
        if (result == true){
            System.out.print("The larger number is: "+ num1);
        } else {
            System.out.print("The larger number is: "+ num2);
        }
    }
}
