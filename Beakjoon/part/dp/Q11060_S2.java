package part.dp;

// https://www.acmicpc.net/problem/11060
// 점프점프

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11060_S2 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 1<=N<=1000   // 0<=A<=100
        int N = Integer.parseInt(st.nextToken());
        int[] map = new int[N+1];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=1;i<N+1;i++){
            map[i] = Integer.parseInt(st.nextToken());
        }

        //ArrayInfo.showIntArr(map);
        jmpjump(map, N);

    }

    private static void jmpjump(int[] map, int N) {
        long[] resultArr = new long[N+1];


        int number = 0;
        int curCnt = -1;
        for(int i=1;i<N+1;i++){     //
            number = map[i];
            for(int j=1;j<=number;j++){
                if(i+j <= N) {
                    if( resultArr[i+j] <= 0 ) {
                        resultArr[i + j] = resultArr[i] + 1;
                    }
                }else{
                    // 끝에 도착
                    break;

                }
            }
        }

        //ArrayInfo.showIntArr(resultArr);
        System.out.println(resultArr[N]);   // 끝에 도작

    }

}
