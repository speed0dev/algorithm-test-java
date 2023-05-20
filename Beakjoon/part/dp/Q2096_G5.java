package part.dp;

// https://www.acmicpc.net/problem/2096
//  내려가기

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2096_G5 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // Line 수
        int N = Integer.parseInt(st.nextToken());
        int [][] map = new int[N+1][3];
        int[][] m = new int[N+1][3];
        int[][] n = new int[N+1][3];
        for(int i=1;i<N+1;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<3;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // max min
        ArrayInfo.showMapArr(map, 0);
        calcMaxMin(map, N, m, n);

    }

    //
    private static void calcMaxMin(int[][] arr, int N, int[][] m , int[][] n) {
;
        for(int i=1;i<N+1;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    m[i][0] += Math.max( m[i-1][0], m[i-1][1]) + arr[i][0];
                    n[i][0] += Math.min( n[i-1][0] ,n[i-1][1]) + arr[i][0];
                }else if(j==1){
                    m[i][1] += Math.max( Math.max(m[i-1][0],m[i-1][1]), m[i-1][2]) + arr[i][1];
                    n[i][1] += Math.min( Math.max(n[i-1][0],n[i-1][1]), n[i-1][2]) + arr[i][1];

                }else if(j==2){
                    m[i][2] += Math.max( m[i-1][1] ,m[i-1][2])+ arr[i][2];
                    n[i][2] += Math.min( n[i-1][1] ,n[i-1][2]) + arr[i][2];
                }
            }
        }

       int m_ = -1;
        int n_ = Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            if(m_ < m[N-1][i]){
                m_ = m[N-1][i];
            }
            if(n_ > n[N-1][i]){
                n_ = n[N-1][i];
            }
        }
        System.out.println(m_+ " " + n_);

        ArrayInfo.showMapArr(m, 0);
        ArrayInfo.showMapArr(n, 0);


    }
}
