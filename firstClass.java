import java.util.Scanner;

class firstClass{
    public static void main(String args[]){
        //System.out.println("Hello"); //prints Hello World! to the console
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum); 
    }
}