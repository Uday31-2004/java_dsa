package patterns;

public class hollowRhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == n) {
                for (int k = 1; k <= n; k++) {
                    System.out.print("*");
                }
            } else {for (int j = 1; j <= n; j++) {
                if (j==1 ||j==n) {
                    System.out.print( "*" );
                }else{
                    System.out.print(" ");
                }
            }
            }
            System.out.println(" ");
        
    }}

}
