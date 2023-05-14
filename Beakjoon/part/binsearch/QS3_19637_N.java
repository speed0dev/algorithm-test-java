package part.binsearch;

// https://www.acmicpc.net/problem/19637
//  IF문 좀 대신 써줘

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Ch{
    public String name;
    public int pow;
    public Ch(String name, int pow){
        this.name = name;
        this.pow = pow;
    }
}

public class QS3_19637_N {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Ch> list = new ArrayList<Ch>();

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            list.add(new Ch(st.nextToken(), Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            int score = Integer.parseInt(br.readLine());
            sb.append(binSearch(score, list)).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static String binSearch(int score, List<Ch> list) {
        int st = 0;
        int end = list.size()-1;
        int mid = 0;
        while(st<=end){
            mid = (st+end)/2;
            if(score > list.get(mid).pow){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return list.get(end+1).name;
    }


}
