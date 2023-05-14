package part.binsearch;

// https://www.acmicpc.net/problem/2805
// 나무자르기
import util.IntArrayGen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QS2_2805 {

    //
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 나무 수
        int M = Integer.parseInt(st.nextToken());   // 나무 길이

        st = new StringTokenizer(br.readLine());
        int[] trees = new int[N];
        int maxLen = 0;
        for(int i=0;i<N;i++){
            trees[i] = Integer.parseInt(st.nextToken());
            if(maxLen < trees[i]){
                maxLen = trees[i];
            }
        }

        Arrays.sort(trees);
        divTree(trees, M, maxLen);
    }

    //
    private static void divTree(int[] trees, long m, int maxLen) {

        int lo = 0;
        int max = maxLen;
        int mid = 0;
        long sum = 0;        // 주의 1<=M<=2,000,000,000
        while(lo <= max){
            mid = (lo + max)/2;
            sum = 0;
            for(int i=0;i<trees.length;i++){
                if(trees[i]-mid > 0) {
                    sum += (trees[i] - mid);
                }
            }
            //System.out.println(" sum:" + sum + " m:" + m);

            if(sum == m){
                System.out.println(mid);    // 결과값
                break;
            }

            if(sum > m){
                lo = mid+1;
            }else{
                max = mid;
            }
        }

    }


}
