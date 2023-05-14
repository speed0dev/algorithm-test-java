package part.binsearch;


// https://www.acmicpc.net/problem/2467
// 용액
// - 이분탐색, 투포인터
// 조건  left, right 합이 0, 0> , 0<
// left++  0<
// right-- 0>

import util.ArrayInfo;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QG5_2467 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // <=2<=100000
        int N = Integer.parseInt(st.nextToken());
        long[] arr = new long[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        //
        //ArrayInfo.showIntArr(arr);
        findSumTotalZero(arr);

    }

    private static void findSumTotalZero(long[] arr) {

        int left = 0;
        int right = arr.length-1;
        long min = Long.MAX_VALUE;
        long sumAbs = 0;
        long sum = 0;
        int s_left = 0;
        int s_right = 0;

        while(left<right){
            sum = (arr[left] + arr[right]);
            sumAbs = Math.abs(arr[left] + arr[right]);
            if(min > sumAbs){
                min = sumAbs;
                s_left = left;
                s_right = right;
            }

            if(sum >= 0){
                right--;

            }else{
                left++;
            }
        }
        //

        System.out.println( arr[s_left] + " " + arr[s_right] + " left:" + s_left + " right:" + s_right );
    }

}
