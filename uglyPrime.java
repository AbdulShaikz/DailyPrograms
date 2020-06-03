import java.util.*;
public class Main
{
    static boolean isUglyPrime(int num){
        if(num==0)
            return false;
        if(num==1)
            return true;
        if(num%2==0){
            num  /= 2;
            return isUglyPrime(num);
        }
        if(num%3==0){
            num  /= 3;
            return isUglyPrime(num);
        }
        if(num%5==0){
            num  /= 5;
            return isUglyPrime(num);
        }
        return false;
    }
	public static void main(String[] args) {
	    int num;
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    System.out.println(isUglyPrime(num));
	}
}
