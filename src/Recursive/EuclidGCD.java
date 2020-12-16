package Recursive;

import java.util.Scanner;

/**
 * 유클리드 호법을 재귀적 방법으로 최대공약수를 구하는 알고리즘으로 구현
 */
public class EuclidGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();
        System.out.print("정수를 입력하세요 : ");
        int y = sc.nextInt();

        System.out.println("두 정수의 최대 공약수는 : "+gcd(x,y));
    }

    /**
     * 유클리드 호법을 코드로 구현현
     */
    static int gcd(int x, int y){
        if(y == 0){
            return x;
        }else{
            return gcd(y, x%y);
        }
    }
}
