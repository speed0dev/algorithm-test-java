package part.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2748_B1_V1 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        long[] arr = new long[N+1];
        arr[0] = 0;
        arr[1] = 1;

        //
        for(int i=2;i<N+1;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[N]);

    }

}
