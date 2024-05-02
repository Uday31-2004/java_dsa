package programs;
//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;

public class circumference {
    
    public static float calculateCircumference(float num) {
        float pi = 3.1415926f; //pi number
        return (2*num * pi);
        
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number");
        float num =  sc.nextFloat();
        float result = calculateCircumference(num);
        System.out.println(result);
    }
}
