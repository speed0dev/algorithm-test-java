package util;

public class MapInfo {

    public static void show(int[][] map){
        System.out.println("----------------------");
        int x = 0;
        int y = 0;
        for(int[] m : map){
            x= 0;
            for(int n : m){
                System.out.print(n + ",");
                ++x;
            }
            System.out.println("");
            ++y;
        }
        System.out.println("========================");
    }

}
