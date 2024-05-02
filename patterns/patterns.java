package patterns;
import java.util.*;

public class patterns {
    // SOLID RECTANGLE
    /*
      public static void main(String[] args) {
      int rows =4;
      int cols = 5;
      for(int i = 1; i<=rows; i++) {
      //System.out.println("*");
      for(int j =1;j <= cols; j++){
      System.out.print("*");
      }
      System.out.println( " ");
      }
      }
     */

    // HOLLOW RECTANGLE
    /*
      public static void main(String[] args) {
      int rows = 4;
      int cols = 5;
      for(int i = 1; i<=rows; i++) {
      //System.out.println("*");
      for(int j =1;j <= cols; j++){
      if (i == 1 || i==rows || j == 1 || j ==cols ) {
      System.out.print("*");
      } else {
      System.out.print(" ");
      }
      }
      System.out.println( " ");
      }
      }
     */

    // half pyramid
    /*
      public static void main(String[] args) {
      int rows = 5;
      int cols = 5;
      for (int i = 1; i <= rows; i++) {
      // System.out.println("*");
      for (int j = 1; j <= cols; j++) {
      if (j <= i) {
      System.out.print("*");
      } else {
      System.out.print(" ");
      }
      }
      System.out.println(" ");
      }
      }
     */

    // INVERTED HALF PYRAMID
    /*
      public static void main(String[] args) {
      int rows = 4;
      int cols = 4;
      for(int i = 1; i<=rows; i++) {
      //System.out.println("*");
      for(int j =1;j <= cols; j++){
      if (i+j <= rows+1) {
      System.out.print("*");
      } else {
      System.out.print(" ");
      }
      }
      System.out.println( " ");
      }
      }
     */

    // INVERTED HALF PYRAMID (ROTATED BY 180 DEGREES)
    /*
      public static void main(String[] args) {
      int rows = 4;
      int cols = 4;
      for(int i = 1; i<=rows; i++) {
      //System.out.println("*");
      for(int j =1;j <= cols; j++){
      if (i+j >= rows + 1 ) {
      System.out.print("*");
      } else {
      System.out.print(" ");
      }
      }
      System.out.println( " ");
      }
      }
     */

    // HALF PYRAMID WITH NUMBERS

    /*
      public static void main(String[] args) {
      int rows = 5;
      int cols = 5;
      for(int i = 1; i<=rows; i++) {
      //System.out.println("*");
      for(int j =1;j <= cols; j++){
      if (j <= i ) {
      System.out.print(j);
      } else {
      System.out.print(" ");
      }
      }
      System.out.println( " ");
      }
      }
     /

    // INVETED HALF PYRAMID WITH NUMBERS

    /*
      public static void main(String[] args) {
      int rows = 5;
      int cols = 5;
      for(int i = 1; i<=rows; i++) {
      //System.out.println("*");
      for(int j =1;j <= cols; j++){
      if (j+i <= rows +1 ) {
      System.out.print(j);
      } else {
      System.out.print(" ");
      }
      }
      System.out.println( " ");
      }
      }
     */

    // FLOYD'S TRIANGLE

    /*
      public static void main(String[] args) {
      int rows = 5;
      int number = 1;
      for(int i = 1; i<=rows; i++) {
      //System.out.println("*");
      for(int j =1;j <= i; j++){
      System.err.print(number + " ");
      number++;
      }
      System.out.println( " ");
      }
      }
     */

    // 0-1 triangle

    /*
      public static void main(String[] args) {
      int rows = 5;
      int cols = 5;
      for (int i = 1; i <= rows; i++) {
      // System.out.println("*");
      for (int j = 1; j <= i; j++) {
      if ((i + j) % 2 == 0) {
      System.err.print(1);
      } else if ((i + j) % 2 != 0) {
      System.out.print(0);
      } else {
      System.out.print(" ");
      }
      }
      System.out.println(" ");
      }
      }
     */

    // BUTTERFLY PATTERN

    /* public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        // upper half
        for (int i = 1; i <= rows; i++) {
            // System.out.println("*");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (rows - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // lower half
        for (int i = rows; i >= 1; i--) {
            // System.out.println("*");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (rows - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    } */

    // Solid Rohumbus
    /* public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }System.out.println(" ");
        }
    } */


    //NUMBER PYRAMID
    /* public static void main(String[] args) {
        int n= 5;
        for(int i=1 ; i<=n ; i++){
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j =1; j<=i;j++ ){
                System.out.print(i + " ");
            }System.out.println(" ");
        }
    } */


    //Palindromic Pattern

    /* public static void main(String[] args){
        int n= 5;
        for(int i =1 ; i<=n;  i++){
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<i+1; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    } */

    //Diamond Pattern

    public static void main(String[] args) {
        int n = 4;
        //upper half
        for(int i =1 ; i<=n;  i++){
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            for(int j=2; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i =n ; i>=1;  i--){
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            for(int j=2; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}