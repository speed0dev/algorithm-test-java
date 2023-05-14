package part.binsearch;

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2776
// 암기왕
//
public class QS6_2776 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }



        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int[] arr2 = new int[M];

        System.out.println("M:" + M);

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        //ArrayInfo.showIntArr(arr1);
        //ArrayInfo.showIntArr(arr2);

        //
        findNumbers(arr1, arr2);

    }

    private static void findNumbers(int[] arr1, int[] arr2) {

        for(int i=0;i<arr2.length;i++){

            int left = 0;
            int right = arr1.length-1;
            int mid = 0;
            while(left<=right){
                mid = (left+right)/2;

                if(arr1[mid] == arr2[i]){
                    System.out.println("1");
                    break;
                }

                if(arr1[mid] > arr2[i]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
            System.out.println("0");
        }

    }

}
