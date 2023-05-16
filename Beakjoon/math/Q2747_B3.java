package math;

// https://www.acmicpc.net/problem/2747
// 피보나치 수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2747_B3 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        // n < 45
        long[] arr = new long[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i=2;i<arr.length;i++){
            //
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[n]);


    }

}
