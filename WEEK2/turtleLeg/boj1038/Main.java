package WEEK2.turtleLeg.boj1038;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Long> q = new LinkedList<>();

        if(N > 1022) System.out.print(-1);

        else if(N < 10) System.out.print(N);

        else{
            int cnt = 0;
            for(int i=1; i<10; i++){
                q.add((long)i);
                cnt++;
            }

            while(cnt < N){

                long k = q.poll();
                long temp = k%10;
                for(int i=0; i<temp; i++){
                    q.add(k*10 + i);
                    cnt++;
                    if(cnt == N){
                        System.out.print(k*10 + i);
                        break;
                    }
                }
            }
        }
    }
}