import java.util.*;
public class Main
{
    public static void isPrime(int lowerBound,int upperBound){
        int prime = 1;
		for(int i=lowerBound;i<upperBound;i++){
		    for(int j=1;j<upperBound;j++){
		       if(i%j==0 && j!=1 && j!=i){
		          prime = 0;
		          continue;
		       }
		     }
		     if(prime==1){
		        System.out.println(i);
		     }
		     else{
		        prime=1;
	         }
	    }
    }
	public static void main(String[] args) {
		int lowerBound,upperBound;
		Scanner input = new Scanner(System.in);
		lowerBound = input.nextInt();
		upperBound = input.nextInt();
		isPrime(lowerBound,upperBound);
	}
}
