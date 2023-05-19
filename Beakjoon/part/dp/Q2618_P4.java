package part.dp;

// https://www.acmicpc.net/problem/2618
//  경찰차 [스페셜]
//   map : 5<=N<=1000
//   테스트횟수 : 1<=W<=1000

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Pos{
    public int x;
    public int y;
    public Pos(int x, int y){
        this.x = x;
        this.y = y;
    }
}


public class Q2618_P4 {

    // N * N
    // 5<=N<=1000
    // 1<=W<=1000
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // N 맵사이즈 N*N
        st = new StringTokenizer(br.readLine(), " ");
        int W = Integer.parseInt(st.nextToken());

        int[][] acts = new int[W][2];
        for(int i=0;i<W;i++){
            st = new StringTokenizer(br.readLine(), " ");
            acts[i][0] = Integer.parseInt(st.nextToken());  //
            acts[i][1] = Integer.parseInt(st.nextToken());  //
        }

        //ArrayInfo.showMapArr(acts, 0);
        calcDis(acts, W, N);

    }

    private static void calcDis(int[][] acts, int W, int N) {

        int[] history = new int[W];
        Pos p1 = new Pos(1,1);
        Pos p2 = new Pos(N, N) ;
        int d = 0;
        for(int i=0;i<W;i++){

            int len1 = Math.abs(p1.y - acts[i][0]) + Math.abs(p1.x - acts[i][1]);//
            int len2 = Math.abs(p2.y - acts[i][0]) + Math.abs(p2.x - acts[i][1]);//
            if(len1<len2){
                history[i] = 1;
                p1.x = acts[i][1];
                p1.y = acts[i][0];
                d+=len1;
            }else{
                history[i] = 2;
                d+=len2;
                p2.x = acts[i][1];
                p2.y = acts[i][0];
            }
        }
        System.out.println(d);
        for(int i=0;i<history.length;i++){
            System.out.println(history[i]);
        }

    }


}
