package part.binsearch;

// https://www.acmicpc.net/problem/19637
// IF문 좀 대신 써줘

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QS3_19637 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   //
        int M = Integer.parseInt(st.nextToken());   //

        int[] pows = new int[N];
        String[] names = new String[N];

        int temp = 0;
        String name = "";
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            temp = Integer.parseInt(st.nextToken());

            pows[i] = temp;
            names[i] = name;
        }

        // N(1<=N<=10^5): 칭호   M(1<=M<=10^5): charater
        int r_pow = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            r_pow = Integer.parseInt(st.nextToken());
            sb.append(searchName(r_pow, pows, names)).append("\n");
        }
        System.out.println(sb.toString());

    }

    private static String searchName(int s, int[] pows, String[] names) {
        //

        if(s <= pows[0]){
            return names[0];
        }
        if(s>= pows[pows.length-1]){
            return names[pows.length-1];
        }

        int lo = 0;
        int hi = pows.length-1;
        int mid = 0;
        while(lo <= hi){

            mid = (lo+hi)/2;

            if(s > pows[mid]){
                lo = mid+1;
            }else {
                hi = mid-1;
            }
        }
        return names[hi+1];
    }
}
