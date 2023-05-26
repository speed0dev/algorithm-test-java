package part.dp;

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/12865
//  평범한 배낭
//   item 기준으로 무게를 측정 할 것.
public class Q12865_G5 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //
        int N = Integer.parseInt(st.nextToken());   // 물품수 1<=N<=100
        int K = Integer.parseInt(st.nextToken());   // 무게   1<=K<=100,000

        int [][] VW= new int[N+1][2];
        for(int i=1;i<N+1;i++){
            st = new StringTokenizer(br.readLine(), " ");
            VW[i][0] = Integer.parseInt(st.nextToken());    // 무게
            VW[i][1] = Integer.parseInt(st.nextToken());    // 가치
        }

        ArrayInfo.showMapArr(VW, 1);

    }

}
