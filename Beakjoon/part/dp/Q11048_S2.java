package part.dp;

// https://www.acmicpc.net/problem/11048
// 이동하기
//  NxM

import util.MapInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11048_S2 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 1<=N,M<=1000
        int N = Integer.parseInt(st.nextToken()) + 1;
        int M = Integer.parseInt(st.nextToken()) + 1;

        int[][] map = new int[N][M];

        for(int i=1;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=1;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp(map, N, M);

    }

    //
    private static void dp(int[][] map, int N, int M) {
        int[][] addMap = new int[N][M];
        int left = 0;
        int top = 0;
        for(int i=1;i<N;i++){
            for(int j=1;j<M;j++){
                left = addMap[i][j-1] + map[i][j];      // left
                top = (addMap[i-1][j] + map[i][j]);     // top
                if(left >= top) {
                    addMap[i][j] = left;
                }else{
                    addMap[i][j] = top;
                }
            }
        }
        //
        System.out.println(addMap[N-1][M-1]);
    }

}
