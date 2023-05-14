package part.math;

// https://www.acmicpc.net/problem/2884
// 알람 시계

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int YY = Integer.parseInt(st.nextToken());
        int MM = Integer.parseInt(st.nextToken());

        int recM = (YY*60 + MM) - 45;
        if(recM < 0){
            recM = (24*60) + recM;
        }
        System.out.println(recM/60 + " " + recM%60);     //
    }
}
