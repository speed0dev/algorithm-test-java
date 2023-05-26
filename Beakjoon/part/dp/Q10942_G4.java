package part.dp;

// https://www.acmicpc.net/problem/10942
//  팰린드롬?

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10942_G4 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //
        int N = Integer.parseInt(st.nextToken());       // 1<=2<=2000
        int[] arr = new int[N+1];                       // 1<= <=100,000

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=1;i<N+1;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean[][] dp = new boolean[N][N];

        //
        for(int i=1; i<N+1; i++){
            dp[i][i] = true;
        }
        //


        st = new StringTokenizer(br.readLine(), " ");
        int M =  Integer.parseInt(st.nextToken());      // 1<=M<=1,000,000
        int S = -1;
        int E = -1;

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine(), " ");
            S = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());




        }

        //
        //ArrayInfo.showIntArr(arr);


        br.close();

    }
}
