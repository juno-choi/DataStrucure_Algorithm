package Algorithm;

import java.util.Scanner;

public class Algorithm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a :");
        int a = sc.nextInt();
        System.out.print("b :");
        int b = sc.nextInt();
        System.out.print("c :");
        int c = sc.nextInt();

        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;

        System.out.println("최댓값 : "+max);
    }

    static int max3(int a, int b, int c){
        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;
        return max;
    }
}
