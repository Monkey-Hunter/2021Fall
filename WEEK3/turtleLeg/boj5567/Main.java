package WEEK3.turtleLeg.boj5567;

import java.util.*;
import java.io.*;

class Hash {
    int visited = 0;
    ArrayList<Integer> friends = new ArrayList<>();

}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int res=0;

        Hash[] hash = new Hash[n+2];

        for(int i=0; i<n+2; i++)
            hash[i] = new Hash();
        
        for(int i=0; i<m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            hash[a].friends.add(b);
            hash[b].friends.add(a);
        }
    
        if(hash[1].friends == null)
            System.out.println(0);

        else{
            for(int i : hash[1].friends){

                hash[i].visited = 1;
                for(int j : hash[i].friends){
                    hash[j].visited = 1;
                }
            }

            for(int i=2; i<=n+1; i++){
                if(hash[i].visited == 1)
                    res++;
            }
            
            System.out.println(res);
        }
           
    }
}