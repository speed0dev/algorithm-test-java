package test.bin2;

import util.IntArrayGen;

public class BinSearchTest {

    public static void main(String[] args){

        int[] arr = IntArrayGen.getNumberArr(2, 30);
        System.out.println("arr len: " + arr.length);

        binSearch(arr, 11);
    }

    //
    public static void binSearch(int[] arr, int fVar) {
        int lo = 0;
        int hi = arr.length-1;
        int mid = 0;
        int nCnt = 0;
        while( lo < hi ){
            ++nCnt;
            mid = (lo + hi)/2;  // mid pos

            if(fVar > arr[mid]){
                lo = mid+1;
            }else if(fVar < arr[mid]){
                hi = mid-1;
            }else{

                break;
            }
        }

        //
        System.out.println(" pos:" + mid + " var:" + arr[mid] + " fVar:" + fVar + " nCnt:" + nCnt);


    }


}
