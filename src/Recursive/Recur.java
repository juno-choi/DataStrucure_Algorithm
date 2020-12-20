package Recursive;

import StackQueue.Stack_1;

import java.util.Scanner;

/**
 * 재귀적 함수 예시 1
 */
public class Recur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력 : ");
        int x = sc.nextInt();

        recur(x);
        System.out.println();
        recur2(x);
        System.out.println();
        recur3(x);
    }

    /**
     * 순수 재귀적 알고리즘
     */
    static void recur(int n){
        if(n>0){
            recur(n-1);
            System.out.print(n);
            recur(n-2);
        }
    }

    /**
     * 꼬리제거 재귀적 알고리즘
     */
    static void recur2(int n){
        while(n>0){
            recur(n-1);
            System.out.print(n);
            n=n-2;
        }
    }

    /**
     * 비재귀적 재귀적 알고리즘
     */
    static void recur3(int n){
        Stack_1 s = new Stack_1(n);     //앞에서 구현해놓은 stack을 사용하겠습니다.

        while(true){
            if(n>0){
                s.push(n);  //n을 stack에 잠시 저장
                n = n-1;
                continue;   //n이 0이 될때까지 stack에 n-1을 반복하여 저장
            }
            if(s.isEmpty() != true){    //stack이 비어있지 않다면
                n = s.pop();    //stack에 잠시 저장되어 있는 n의 값을 가져옴
                System.out.print(n);  //n을 먼저 출력하고
                n = n-2;
                continue;   //n에 n-2값을 넣어주고 다시 반복문의 처음으로 되돌림림
           }
            break;
        }
    }
}
