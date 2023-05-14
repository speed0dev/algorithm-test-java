package part.binsearch;

// https://www.acmicpc.net/problem/1920
// 수 찾기


import util.IntArrayGen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class QS4_1920 {

    //
    public static  void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N_cnt = Integer.parseInt(st.nextToken());

        int[] N_arr = new int[N_cnt];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N_cnt;i++){
            N_arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int M_cnt = Integer.parseInt(st.nextToken());
        int[] M_arr = new int[M_cnt];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M_cnt;i++){
            M_arr[i] = Integer.parseInt(st.nextToken());
        }


        finds(N_arr, M_arr);

    }

    private static void finds(int[] N, int[] M) {
        // N 정렬하기
        Arrays.sort(N);
        
        for(int i=0;i<M.length;i++){
            binSearchNumber(N, M[i]);
        }

    }

    private static void binSearchNumber(int[] N, int s) {
        int hiPos = N.length-1;
        int loPos = 0;
        int midPos = 0;
        
        while(loPos <= hiPos){      // 반드시 같을때도 비교

            midPos = (loPos + hiPos)/2;

            if(s < N[midPos]){
                hiPos = midPos-1;
            }else if( s > N[midPos]){
                loPos = midPos+1;
            }else{
                System.out.println("1");
                return;
            }
        }
        System.out.println("0");

    }

}
