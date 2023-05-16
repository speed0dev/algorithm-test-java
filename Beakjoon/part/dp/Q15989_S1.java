package part.dp;

//  https://www.acmicpc.net/problem/15989
//  1, 2, 3 더하기 4

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Q15989_S1 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // T test갯수
        int T = Integer.parseInt(st.nextToken());
        int[] arr = new int[T];
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayInfo.showIntArr(arr);

    }

}
