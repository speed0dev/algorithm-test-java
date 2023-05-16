package greedy;

// https://www.acmicpc.net/problem/11399
// ATM
//  최소시간 정렬 <--
//     각 시간마다 더한 값

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399_S4 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());     // 사람수 1<=N<=1000
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //
        Arrays.sort(arr);

        int[] arrSum = new int[N];
        arrSum[0] = arr[0];
        int total = arr[0];
        //arrSum[1] = arrSum[0] + arr[1];
        for(int i=1;i<N;i++){
             arrSum[i] = arrSum[i-1]+arr[i];
             //System.out.println(arrSum[i]);
             total += arrSum[i];
        }

        System.out.println(total);
        
    }

}
