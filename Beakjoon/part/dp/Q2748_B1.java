package part.dp;

// https://www.acmicpc.net/problem/2748
// 피보나치 수 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2748_B1 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int len = N+1;
        // n < 90
        long[] arr = new long[len];   //

        arr[0] = 1;     //
        arr[1] = 1;     //

        System.out.println(fibo(arr, N));



    }

    private static long fibo(long[] arr, int n) {

        if(arr[n] > 0){
            return arr[n];
        }
        return arr[n] = fibo(arr,n-1) + fibo(arr, n-2);

    }

}
