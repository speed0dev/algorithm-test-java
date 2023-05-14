package part.binsearch;

// https://www.acmicpc.net/problem/1790
// 수 이어 쓰기 2
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QG5_1790 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        
        int N = Integer.parseInt(st.nextToken());   // N(1 ≤ N ≤ 100,000,000)
        int K = Integer.parseInt(st.nextToken());   // 자리수

        StringBuffer sb = new StringBuffer();
        sb.append("0");     // 0 부터 시작 하므로..
        for(int i=1;i<=N;i++){
            sb.append(i);
        }

        //System.out.println(sb.toString());

        char[] code = sb.toString().toCharArray();
        System.out.println(code[K]);
    }

}
