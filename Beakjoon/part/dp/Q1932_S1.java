package part.dp;

// https://www.acmicpc.net/problem/1932
// 정수 삼각형


import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932_S1 {

    public static void main(String[] agrs) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 1<=N<=500
        int[][] arr = new int[N+1][N+1];

        //
        for(int i=1;i<N+1;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=1;j<=i;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        maxValue(arr, N);

    }

    private static void maxValue(int[][] arr, int N) {
        int[] sum = new int[N+1];

        int v1 = -1;    // left
        int v2 = -1;    // top
        for(int i=1;i<N+1;i++){
            for(int j=1;j<=i;j++){
                v1 = arr[i-1][j] + sum[i];
                v2 = arr[i-1][j-1] + sum[i];

                if(v1>v2){
                    sum[j] += v1;
                }else{
                    sum[j] += v2;
                }
            }
            //ArrayInfo.showIntArrSpace(sum, 1);
        }

        int max = 0;
        for(int i=1;i<sum.length;i++){
            if(max < sum[i]) {
                max = sum[i];
            }
        }
        System.out.println(max);

    }

}
