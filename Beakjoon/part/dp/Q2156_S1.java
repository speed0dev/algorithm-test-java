package part.dp;


// 2156
// https://www.acmicpc.net/problem/2156
// 포도주 시식
// 실버1
// INPUT 잔의 갯수 (1<N<10,000)
// 포도주 양의 순서 0 < S < 1000
// 계단오르기와 동일

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2156_S1 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // Input
        int[] arr = new int[N+1];

        for(int i=1;i<=N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //System.out.println(Arrays.toString(arr));

        makeMaxTotal(arr, N);

    }

    private static void makeMaxTotal(int[] arr, int N) {

        int[] dp = new int[N+1];
        dp[1] = arr[1];
        if(N > 1) { // <-- 이부분
            dp[2] = arr[1] + arr[2];
        }

        for(int i=3;i<N+1;i++){
            dp[i] = Math.max( dp[i-1], Math.max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i]);
        }

        System.out.println(dp[N]);
    }

}
