package WEEK2.turtleLeg.boj2580;

import java.util.*;
import java.io.*;

public class Main {

    public static int[][] board = new int[9][9];

    public static boolean check(int row, int col, int num){
        for(int i=0; i<9; i++)
            if(board[row][i] == num)
                return false;

        for(int i=0; i<9; i++){
            if(board[i][col] == num)
                return false;
        }

        int r = row - (row%3);
        int c = col - (col%3);

        for(int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[r+i][c+j] == num)
                    return false;
            }
        }   

        return true;
    }

    public static void solve(int row, int col){

        if(col == 9){
            solve(row+1, 0);
            return;
        }

        if(row == 9){
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    sb.append(board[i][j]).append(" ");
                }
                sb.append("\n");
            }

            System.out.print(sb);

            System.exit(0);
        }

        if(board[row][col] == 0){
            for(int i=0; i<=9; i++){
                if(check(row, col, i)){
                    board[row][col] = i;
                    solve(row, col+1);
                }
            }
            
            board[row][col] = 0;
            return;
        }   

        solve(row, col+1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=0; i<9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(0,0);
    }
}
