import java.util.*;
import java.lang.*;
public class Main{
    public static void gcd(int a,int b){
        int gcdResult=0;
        while(a!=b){
            if(a>b)
                a = a-b;
            if(b>a)
                b= b-a;
        }
        gcdResult = b;
        System.out.println(gcdResult);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        gcd(a,b);
    }
}