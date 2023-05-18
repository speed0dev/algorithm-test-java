package part.dp;

// https://www.acmicpc.net/problem/2011
// 암호코드
// d[0]+d[1]


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2011_G5_s1 {
    public static void main(String[] args) throws Exception{
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        long[] dp = new long[N.length()+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<N.length()+1;i++){
            if(N.charAt(i-1) =='0'){
                if(N.charAt(i-2)=='1'||N.charAt(i-2)=='2'){
                    dp[i] = dp[i-2]%1000000;
                }else{
                    break;
                }
            }else{
                int number = Integer.parseInt(N.substring(i-2, i));
                if(number <27 && number > 9){
                    dp[i] = (dp[i-1] + dp[i-2])%1000000;
                }else{
                    dp[i] = dp[i-1]%1000000;
                }
            }
        }

        System.out.println(dp[N.length()]%1000000);

    }


}
