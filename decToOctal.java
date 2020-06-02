import java.util.*;
import java.lang.*;
public class Main{
    public static void decimalToOctal(int dec){
        int length = (int)(Math.log10(dec)+1);
        int octal[] = new int[length*2];
        int i=0;
        while(dec!=0){
            octal[i] = dec%8;
            i++;
            dec /= 8;
        }
        String octalNumber="";
        for(int j=i-1;j>=0;j--){
            octalNumber += octal[j];
        }
        System.out.println(octalNumber);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int dec;
        dec = input.nextInt();
        decimalToOctal(dec);
    }
}