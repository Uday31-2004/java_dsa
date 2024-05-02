import java.util.*;
//age

/* public class secondClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age" );
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("Sorry you are not eligible to vote");
        }
    }
}
 */

         //odd or even

/* public class secondClass {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number" );
       int number = sc.nextInt();
       if (number%2==0){
           System.out.println("Even");
       }else{
           System.out.println("Odd");
       }
   }
} */

        //equal, greater, lesser

/* public class secondClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number" );
        int n1 = sc.nextInt();
        System.out.println("Enter first number" );
        int n2 = sc.nextInt();
        if (n1==n2){
            System.out.println("Equal");
        }else if(n1>n2){
            System.out.println("number1 is greater");
        }else{
            System.out.println("number1 is lesser");
        }
    }
} */

//switch-case 

public class secondClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int button = sc.nextInt();
        switch (button) {
            case 1: {
                System.out.println("hello");

                break;
            }case 2: {
                System.out.println("Namastey");

                break;
            }case 3: {
                System.out.println("Bonjour");

                break;
            }

            default:System.out.println( "Unknown command");
                break;
        }
    }
}