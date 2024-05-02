//take an array as input from the user. search for a given number x and print the index at which it occurs.



package Array;
import java.util.*;
public class q1 {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int size =  sc.nextInt();
        int [] arr = new int[size];

        for(int i=0 ;i<size;i++){
            System.out.print("Enter element "+(i+1)+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();
        for(int i=0;i<size;i++){
            if (arr[i] == num){
                System.out.println("The number is found at index:" + i);
            }
        }
    }
}
