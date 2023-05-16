package part.dp;

// https://www.acmicpc.net/problem/11060
// 점프점프
//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11060_S2_s1 {

    public static void main(String[] args) throws Exception{
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sb.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        long[] r_arr = new long[1101];
        st = new StringTokenizer(sb.readLine(), " ");
        for(int i=1;i<N+1;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            r_arr[i] = Integer.MAX_VALUE;
        }

        //
        r_arr[1]=0;
        for(int i=0;i<N+1;i++){
            if(r_arr[i] >= Integer.MAX_VALUE)
                continue;
            for(int j=1;j<=arr[i];j++){
                r_arr[i+j] = Math.min(r_arr[i+j], r_arr[i]+1);  //
            }
        }

        if(r_arr[N] >= Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(r_arr[N]);
        }



    }

}
