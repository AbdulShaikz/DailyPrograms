import java.util.*;
import java.lang.*;
public class Main { 
    /*x raised to the power y */
    static int power(int x, int y) 
    { 
        if (y == 0) 
            return 1; 
        else if (y % 2 == 0) 
            return power(x, y / 2) * power(x, y / 2); 
        else
            return x * power(x, y / 2) * power(x, y / 2); 
    } 
    public static void main(String[] args) 
    { 
        int x,y;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        System.out.printf("%d", power(x, y)); 
    } 
} 
  