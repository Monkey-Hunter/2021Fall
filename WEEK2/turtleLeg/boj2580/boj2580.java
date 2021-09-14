package turtleLeg.boj2580;

import java.util.*;
import java.io.*;

public class boj2580 {
    public static void main(String[] args) throws IOException{
        int[][] sudoku = new int [9][9];
        int[][] line = {{0,1,2},{3,4,5},{6,7,8}};
        // int[] number = {0,1,2,3,4,5,6,7,8,9};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<9; i++){
            String S = br.readLine();
            StringTokenizer st = new StringTokenizer(S);

            for(int j=0; j<9; j++)
                sudoku[i][j] = Integer.parseInt(st.nextToken());               
        }

        while(true){

            // 가로줄 확인
            for(int i=0; i<9; i++){
                int sum = 0, ptr = 0, check = 0;
                for(int j=0; j<9; j++){
                    sum += sudoku[i][j];
                    if(sudoku[i][j] == 0){
                        ptr = j; check++;
                    }
                }   
                if(check > 1) break;
                int gap = 45 - sum;
                if(gap < 10 && gap > 0) sudoku[i][ptr] = gap;
            }

            // 세로줄 확인
            for(int i=0; i<9; i++){
                int sum = 0, ptr = 0, check = 0;
                for(int j=0; j<9; j++){
                    sum += sudoku[j][i];
                    if(sudoku[j][i] == 0){
                        ptr = j; check++;
                    }
                }
                if(check > 1) break;
                int gap = 45 - sum;
                if(gap < 10 && gap > 0) sudoku[ptr][i]= gap;
            }

            // 사각형 확인
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    int sum = 0, check = 0;
                    int[] ptr = new int[2];
                    for(int k=0; k<3; k++){
                        for(int l=0; l<3; l++){
                            sum += sudoku[line[i][k]][line[j][l]];
                            if(sudoku[line[i][k]][line[j][l]] == 0){
                                ptr[0] = k;
                                ptr[1] = l;
                                check ++;
                            } 
                        }
                    }
                    if(check > 1) break;
                    int gap = 45 - sum;
                    if(gap < 10 && gap > 0) sudoku[line[i][ptr[0]]][line[j][ptr[1]]] = gap;
                }
            }
            // 반복 조건 확인
            Boolean complete = false;
            for(int i=0; i<9; i++)
                for(int j=0; j<9; j++){
                    if(sudoku[i][j] == 0){
                        complete = false;
                        break;
                    }
                    else complete = true;
                }

            if(complete) break;
        }

        // 출력
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++)
                sb.append(sudoku[i][j]).append(" ");
            sb.append("\n");
        }
        System.out.print("\n");
        System.out.print(sb);
    }
}
