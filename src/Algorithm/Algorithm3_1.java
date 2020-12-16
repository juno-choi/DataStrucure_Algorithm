package Algorithm;

import java.util.Scanner;

public class Algorithm3_1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        a[3] = 6;

        for(int s : b){
            System.out.println(s);
        }
    }
}
