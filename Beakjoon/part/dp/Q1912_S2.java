package part.dp;

// https://www.acmicpc.net/problem/1912
//  연속합
//  연속된 수 1<=n<=100000

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1912_S2 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];       // number -1000<=number<=1000

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //ArrayInfo.show(arr);
        int[] dp = new int[n];
        dp[0] = arr[0];
        int max = arr[0];
        for(int i=1;i<n;i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]); // Max 값을 비교해서 넣음.
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);

    }
}
