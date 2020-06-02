import java.util.*;
public class Main
{
    static void decToHex(int dec){
        char hex[] = new char[dec*2];
        int rem=0,i=0;
        while(dec!=0){
            rem = dec%16;
            if(rem<10){
                hex[i] = (char) (rem + 48);
                i++;
            }
            else{
                hex[i] = (char)(rem + 55);
                i++;
            }
            dec /= 16;
        }
        		 for(int j=i-1; j>=0; j--) 
	            System.out.print(hex[j]); 
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dec;
		dec = input.nextInt();
		decToHex(dec);
	}
}
