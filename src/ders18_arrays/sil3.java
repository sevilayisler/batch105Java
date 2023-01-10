package ders18_arrays;

import java.util.Arrays;

public class sil3 {
    public static void main(String[] args) {
        int[]arr={1,3,4,7};
        arr=elementleri2Topla(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] elementleri2Topla(int []arr){
        for (int i=0; i<arr.length;i++ ){
            arr[i]=arr[i]+2;
        }
    return arr;
    }

}
