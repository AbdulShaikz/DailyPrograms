import java.util.*;
import java.lang.*;
public class Main
{
	public static void primeFactors(int n){
	   // String pFactors="";
	    List<Integer> pFactors = new ArrayList<>();
	    for(int i=2;i<=n;i++){
	        while(n%i==0){
	            pFactors.add(i);
	            n = n/i;
	        }
	    }
	    if(n>1)
	        pFactors.add(n);
	   
	    int pF[] = new int[pFactors.size()];
	    for (int i=0; i < pF.length; i++)
        {
            pF[i] = pFactors.get(i).intValue();
        }
	   // pF = Ints.toArray(pFactors);
	    int frequency[] = new int[pFactors.size()];
	    int visited = -1;
	   // pF = pFactors.toCharArray();
	    for(int i=0;i<pFactors.size();i++){
	        int count =1;
	        for(int j=i+1;j<pFactors.size();j++){
	            if(pF[i]==pF[j]){
	                count++;
	                frequency[j] = visited;
	            }
	        }
	        if(frequency[i]!=visited){
	            frequency[i]=count;
	        }
	    }
	    for(int i = 0; i < frequency.length; i++){  
            if(frequency[i] != visited)  
                System.out.println("(" + pF[i] + "," +frequency[i] + ")");  
	    } 
	}
	public static void main(String[] args) {
	   int n;
	   Scanner input = new Scanner(System.in);
	   n = input.nextInt();
	   primeFactors(n);
	}
}
