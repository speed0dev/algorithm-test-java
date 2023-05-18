package part.dp;

// https://www.acmicpc.net/problem/2011
// 암호코드
// 1~0 => 26
// A: 1  Z:26 가지

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2011_G5 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //
        int N = Integer.parseInt(st.nextToken());

        countCodes(N);

    }

    private static void countCodes(int N) {
        char[] b = new String("" + N).toCharArray();
        //ArrayInfo.showCharArr(b);

        int[] alphs = new int[26+1];    // A:1 Z:26

        int number = 0;
        for(int i=1;i<b.length;i++){
            number = Integer.parseInt("" + b[i-1]);

            ++alphs[number];        //

            number = Integer.parseInt("" + b[i]+b[i-1]);
            if(number<26){
                ++alphs[number];    //
            }
        }

        //
        //ArrayInfo.showIntArr(alphs);
        long d = 1;
        for(int i=1;i<alphs.length;i++){
            if(alphs[i]!=0) {
                d = (d +alphs[i]) % 1000000;
            }
        }
        System.out.println(d);
    }

}
