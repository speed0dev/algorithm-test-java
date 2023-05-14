package part.binsearch;

// https://www.acmicpc.net/problem/2473
// 세 용액
// N < 1,000,000,000

import util.ArrayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QG3_2473 {

    // 입력배열수
    // N (3<=N<=5000)
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] Y = new long[N];
        for(int i=0;i<N;i++){
            Y[i] = Long.parseLong(st.nextToken());
        }

        findMid3Var(Y);

    }

    private static void findMid3Var(long[] Y) {
        Arrays.sort(Y);
        ArrayInfo.show(Y);

        int mPos = -1;

        int st = 0;
        int ed = Y.length-1;
        int md = 0;

        while(st<=ed){
            md = (st+ed)/2;

            if(Y[md] == 0){
                break;
            }

            if(Y[md]>0){
                ed=md-1;
            }else{
                st=md+1;
            }
        }

        System.out.println(" md:" + md + " " + Y[md]);

    }


}
