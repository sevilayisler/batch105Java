package ders18_arrays;

import java.util.Arrays;

public class sil2 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};

int []arr2=new int [arr.length+1];// [0,0,0,0,0,0]
        for (int i=0; i<arr.length;i++) {

            arr2[i] = arr[i];
        }
            System.out.println(Arrays.toString(arr2));
arr2[arr2.length-1]=5;
        System.out.println(Arrays.toString(arr2));

        arr=arr2;
        System.out.println(Arrays.toString(arr));
        }

    }

