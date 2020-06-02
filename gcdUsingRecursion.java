import java.util.*;
import java.lang.*;
public class Main{
    public static int gcd(int a,int b){
        int gcdResult = 0;
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(gcd(a,b));
    }
}