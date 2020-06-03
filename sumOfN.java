import java.util.*;
public class Main{
    static int sumOfN(int n){
        return n==0?0:n+sumOfN(n-1);
        
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        System.out.println(sumOfN(n));
    }
}