/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n,prime=1;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		for(int i=2;i<n;i++){
		    if(n%i==0 && n!=2){
		        prime = 0; 
		        break;
		    }
		    else{
		        prime = 1;
		    }
		}
		if(prime==1){
		    System.out.println(n +" is a prime.");
		}
		else{
		    System.out.println(n +" is not a prime.");
		}
	}
}
