package part.binsearch;

// https://www.acmicpc.net/problem/11663
// 선분 위의 점
//
// 최소값 pos, 최대값 pos 구하는 것

/*
11663
2805
2512
19637
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QS3_11663 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 1<=N<=100,000 점의 갯수
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] arrN = new long[N];
        Arrays.sort(arrN);
        for(int i=0;i<N;i++){
            arrN[i] = Long.parseLong(st.nextToken());
        }

        //ArrayInfo.show(arrN);
        StringBuilder sb =  new StringBuilder();
        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            sb.append( findDotCount(arrN, Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()))).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int findDotCount(long[] arrN, long st, long ed) {
        //System.out.println( ">>> st:" +  st + " end:" + ed);

        int posSt = findPos(arrN, st, 0);
        int posEd = findPos(arrN, ed, 1) ;

        //System.out.println( ">>> stIdx:" +  posSt + " endIdx:" + posEd);

        return (posEd - posSt);
    }

    private static int findPos(long[] arrN, long fPos, int type) {

        int left = 0;
        int right = arrN.length-1;
        int mid = 0;
        if(type==0) {
            while (left <= right) {
                mid = (left + right) / 2;

                if (fPos > arrN[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;    // 시작점
        }else{
            while(left <= right){
                mid = (left+right)/2;
                if(fPos < arrN[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            return right+1;
        }

    }


}
