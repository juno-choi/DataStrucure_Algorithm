package Recursive;

import java.util.Scanner;

/**
 * 재귀 알고리즘을 사용하여 Factorial 구현
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        System.out.println(x+"의 factorial 결과 : "+factorial(x));
    }

    static int factorial(int n){
        if(n > 0){
            return n * factorial(n-1);
        }else{
            return 1;
        }
    }

}
