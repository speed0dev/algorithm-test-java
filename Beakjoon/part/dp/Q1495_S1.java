package part.dp;

// https://www.acmicpc.net/problem/1495
// 기타리스트

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1495_S1 {

    public static void main(String[] args) throws Exception{
        //test1();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());   // 0<=S<=M
        int M = Integer.parseInt(st.nextToken());   // 1<=M<=1000 Max

        // P+V[i], P-V[i]
        // MAX[P+V[i], P-V[i]]

        int[] arr = new int[N+1];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=1;i<N+1;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        volumes(arr, N, S, M);
        //ArrayInfo.showIntArrSpace(arr, 1);


    }

    private static void volumes(int[] arr, int N, int st, int max) {
        int[] volums = new int[max+1];
        for(int i=0;i<max+1;i++){
            volums[i] = -1;
        }
        volums[st] = 0;

        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<N+1;i++){
            list.clear();
            for(int j=0;j<max+1;j++){
                if(volums[j] == i-1){ //
                   if(0<=j-arr[i] && j-arr[i]<=max){
                       list.add(j-arr[i]);
                   }
                   if(0<=j+arr[i] && j+arr[i]<=max){
                       list.add(j+arr[i]);
                   }
                }
            }
            for(int v: list){
                volums[v] = i;
            }
        }
        //
        for(int i=max;i>=0;i--){
            if(volums[i] == N){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    private static void test1() {
        System.out.println(Math.pow(2, 50)); // 1.125899906842624E15
    }

}
