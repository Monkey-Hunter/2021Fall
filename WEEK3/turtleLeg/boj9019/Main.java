package WEEK3.turtleLeg.boj9019;

import java.io.*;
import java.util.*;

public class Main {

    public static StringBuilder sb = new StringBuilder();


    public static int D(int num){
        int res = num*2;
        if(res > 9999)
            res %= 10000;
        
        return res;
    }

    public static int S(int num){
        int res;
        if(num == 0) res = 9999;
        else res = num - 1;

        return res;
    }

    public static int L(int num){
        int d4 = num/1000;
        num -= d4*1000;
        int d3 = num/100;
        num -= d3*100;
        int d2 = num/10;
        num -= d2*10;
        int d1 = num;

        int res = d2*1000 + d3*100 + d4*10 + d1;

        return res;
    }

    public static int R(int num){
        int d4 = num/1000;
        num -= d4*1000;
        int d3 = num/100;
        num -= d3*100;
        int d2 = num/10;
        num -= d2*10;
        int d1 = num;

        int res = d4*1000 + d1*100 + d2*10 + d3;

        return res;
    }

    public static void solve(int num, int taret){
        
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            solve(num, target);
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
