package Algorithm;

import java.util.Random;
import java.util.Scanner;

public class Algorithm3_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for(int i=0; i<num; i++){
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println("역순으로 정렬을 완료했습니다.");
        for(int i=0; i<num; i++){
            System.out.println("x["+i+"] = "+x[i]);
        }
    }

    //배열의 값을 교환하는 알고리즘
    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    //배열의 값을 역순으로 정렬하는 알고리즘
    static void reverse(int[] a){
        for(int i=0; i<(a.length/2); i++){
            swap(a, i, a.length-i-1);
        }
    }

}
