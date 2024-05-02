package patterns;

import java.util.Scanner;

public class hollowButterfly {
    public static void main(String[] args) {
        int rows = 15;

        

        int midRow = rows / 2 + 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j == 1 || j == rows || i == midRow || j == i || j == rows - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    }
}
