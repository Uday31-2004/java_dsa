package programs;

import java.util.Scanner;

public class table {
    public static int getTable(int num){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(num + "*" + i + "=" +  (num * i));
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int  num = sc.nextInt();
        getTable(num);
    }
}
