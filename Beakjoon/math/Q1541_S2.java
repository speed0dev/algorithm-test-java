package math;

// https://www.acmicpc.net/problem/1541
// 잃어버린 괄호
//  -대상으로 문자열을 분리
//  -처음1번은 +숫자 나머진 모두 -숫자

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1541_S2 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");


        String tmp = "";
        String[] numbers;
        long sum = 0;       // 0<=n<=99999
        int nCount = 0;
        while(st.hasMoreElements()){
            tmp = st.nextToken();
            numbers = tmp.split("\\+"); //
            for(String n : numbers) {
                if(nCount==0) {
                    sum += Integer.parseInt(n);
                }else{
                    sum -= Integer.parseInt(n);
                }
            }
            ++nCount;
        }
        System.out.println(sum);

    }

}
