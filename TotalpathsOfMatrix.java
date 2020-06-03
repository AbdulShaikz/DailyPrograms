import java.util.*;
public class Main{
    static int numberOfPaths(int matrix[][]){
        int count[][] = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            count[i][0]=1;
        }
        for(int j=0;j<matrix[0].length;j++){
            count[0][j]=1;
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                count[i][j] = count[i-1][j] + count[i][j-1];
            }
        }
        return count[matrix.length-1][matrix[0].length-1];
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int m,n;
        m = input.nextInt();
        n = input.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println(numberOfPaths(matrix));
    }
}