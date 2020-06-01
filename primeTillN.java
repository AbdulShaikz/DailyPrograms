/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
    public static void isPrime(int n){
        int prime = 1;
        if(n==0 || n==1 || n==2){
		    System.out.println("No prime numbers in this range");
		}
		else{
		    for(int i=2;i<n;i++){
		        for(int j=1;j<n;j++){
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
    }
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		isPrime(n);
	}

}
