import java.util.*;
public class Main
{
	public static void factors(int n){
	    for(int i=1;i<=n;i++){
	        if(n%i==0){
	            System.out.println(i);
	        }
	    }
	}
	public static void main(String[] args) {
	   int n;
	   Scanner input = new Scanner(System.in);
	   n = input.nextInt();
	   factors(n);
	}
}
