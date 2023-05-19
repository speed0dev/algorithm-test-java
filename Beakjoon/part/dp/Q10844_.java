package part.dp;

// https://www.acmicpc.net/problem/10844
//  쉬운 계단 수
//  dp[1~9]까지 구한 수를 더한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10844_ {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // N 1<=N<=1000
        int N = Integer.parseInt(st.nextToken());   //

        calcSum(N);


    }

    private static void calcSum(int N) {
        long div = 1000000000;
        long[][] dt = new long[N+1][10];     // 10개

        for(int i=1;i<10;i++){
            dt[1][i] = 1;
        }


        for(int i=2;i<N+1;i++){

            for(int j=0;j<10;j++){
                if(j==0){
                    dt[i][0] = dt[i-1][1]%div;

                }else if(j==0){
                    dt[i][9] = dt[i-1][8]%div;

                }else{
                    dt[i][j] = (dt[i-1][j-1] + dt[i-1][j+1])%div;
                }
            }
        }

        long r = 0;
        for(int i=0;i<10;i++){
            r += dt[N][i];
        }
        System.out.println(r%div);
    }

}
