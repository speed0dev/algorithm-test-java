package part.binsearch;

// https://www.acmicpc.net/problem/2512
// 예산

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QS3_2512 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 3<=N<=10,000
        long[] arr = new long[N];                   // 1,000,000,000
        st = new StringTokenizer(br.readLine());
        long add = 0;
        for(int i=0;i<N;i++){
            arr[i] = Long.parseLong(st.nextToken());
            add += arr[i];
        }

        st = new StringTokenizer(br.readLine());
        long M = Long.parseLong(st.nextToken());

        System.out.println(divN(arr, M, add));

    }

    //
    private static long divN(long[] arr, long m, long add) {

        long left = 0;
        long right = m;
        long mid = 0;
        long sum = 0;

        while(left<=right){

            mid = (left+right)/2;

            for(long mm : arr){
                sum += mm;
            }

            if(sum > m){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return right;

    }
}
