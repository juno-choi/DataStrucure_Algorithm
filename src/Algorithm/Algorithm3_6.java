package Algorithm;

import java.util.Scanner;

public class Algorithm3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 a의 요소수 : ");
        int na = sc.nextInt();

        int[] a = new int[na];

        for(int i=0; i<a.length; i++){
            System.out.print("a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("배열 a의 요소수 : ");
        int nb = sc.nextInt();

        int[] b = new int[nb];

        for(int i=0; i<b.length; i++){
            System.out.print("b["+i+"] : ");
            b[i] = sc.nextInt();
        }

        System.out.println("배열 a와 b는 "+(equals(a,b) ? "같습니다" : "같지 않습니다"));


    }

    //두 배열의 값을 비교
    static boolean equals(int[]a , int[] b){
        if(a.length != b.length){
            return false;
        }

        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

}
