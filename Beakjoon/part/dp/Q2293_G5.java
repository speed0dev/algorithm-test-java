package part.dp;

// https://www.acmicpc.net/problem/2293
//  동전 1

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2293_G5 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());     // 동전수
        int k = Integer.parseInt(st.nextToken());     // 가치 합

        int arr[] = new int[n+1];
        for(int i=1;i<n+1;i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long[] sum = new long[n+1];
        sum[1] = k/arr[1];
        for(int i=2;i<n+1;i++){
            sum[i] = sum[i-1] + k/arr[i];
        }

        ArrayInfo.show(sum);

        System.out.println(arr[n]);
    }

}
