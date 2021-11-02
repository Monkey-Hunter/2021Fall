package WEEK4.turtleLeg.boj10830;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[][] resMatrix;

    public 

    public static void fastCalc(int[][] matrix, int N){

        if(N%2 == 1){

        }
        else{

        }

        return;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[N][N];
        resMatrix = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
                resMatrix[i][j] = matrix[i][j];
            }
        }

        for(int i=0; i<M-1; i++){

            for(int row=0; row<N; row++){
                for(int col=0; col<N; col++){



                }
            }


        }

    }
}
