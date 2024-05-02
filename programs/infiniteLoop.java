package programs;
//Write an infinite loop using do while condition.
public class infiniteLoop {
    
    public static void main(String[] args) {
        int x = 0, y = 1;
        int temp =x;
        x =y;
        y = temp;
        do{
            System.out.println("heyy");
            
        }while(y<x);
    }
}
