import java.util.*;
import java.lang.*;
public class Main{
    public static void convertBinToDec(String bin){
        int binary = Integer.parseInt(bin),rem=0;
        int decimal=0,power=0;
        int decimalDigit = 0;
        while(binary!=0){
            rem = binary%10;
            decimalDigit = rem * (int)(Math.pow(2,power));
            decimal += decimalDigit;
            power++;
            binary /= 10;
        }
        System.out.println(decimal);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String binary;
        binary = input.next();
        convertBinToDec(binary);
    }
}