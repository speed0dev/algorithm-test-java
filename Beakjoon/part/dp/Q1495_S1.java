package part.dp;

// https://www.acmicpc.net/problem/1495
// 기타리스트

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Q1495_S1 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());   // 0<=S<=M
        int M = Integer.parseInt(st.nextToken());   // 1<=M<=1000

        // P+V[i], P-V[i]
        // MAX[P+V[i], P-V[i]]
        //

        System.out.println(N + " " + S + " " + M);



    }

}
