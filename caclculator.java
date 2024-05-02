
import java.util.*;

public class caclculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1 :");
        int a = sc.nextInt() ;
        System.out.print("Enter the second number :" );
        int b = sc.nextInt() ;
        System.out.println("Enter 1 for Addition\nEnter 2 for Substraction \nEnter 3 for Multiplication\nEnter 4 for Divide \nEnter 5 for  modulus ");
        System.out.print("Enter the Choice :" );
        int choice = sc.nextInt() ;
        switch (choice) {
            case 1:{
                System.out.println(a+b);
                break;
            }case 2:{
                System.out.println(a-b);
                break;
            }case 3:{
                System.out.println(a*b);
                break;
            }case 4:{
                System.out.println(a/b);
                break;
            }case 5:{
                System.out.println(a%b);
                break;
            }
            
        
        
            default:System.out.println( "Invalid Choice ");  
                break;
        }
    }
}
