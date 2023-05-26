package part.dp;

// https://www.acmicpc.net/problem/15486
//  퇴사 2

import util.ArrayInfo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q15486_S4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());       // 1<=N<=1,500,000
        int[][] days = new int[N+1][2];

        for(int i=1;i<N+1;i++){
            st = new StringTokenizer(br.readLine(), " ");
            days[i][0] = Integer.parseInt(st.nextToken());
            days[i][1] = Integer.parseInt(st.nextToken());
        }

        //ArrayInfo.showMapArr(days, 0);
        dp(days, N);

        br.close();

    }

    private static void dp(int[][] days, int N) {
        int[] dp = new int[N+2];        // N+2 8일까지
        int max = -1;
        for(int i=1;i<N+1;i++){

            if(max < dp[i]){
                max = dp[i];
            }

            int next = i + days[i][0];      //
            if(next < N+2){
                //dp[next] = Math.max(dp[i] + days[i][1], dp[next]);  // next정산값 Max 값 선택
                dp[next] = Math.max(dp[next], max + days[i][1]);
            }
            //
            //dp[i+1] = Math.max(dp[i], dp[i+1]);      // 오늘 값 다음 정산값

        }
        System.out.println(dp[N+1]);
    }
}
