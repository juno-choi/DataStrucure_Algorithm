package Algorithm;

import java.util.Scanner;

public class Algorithm2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지 합");
        System.out.print("n : ");

        int n = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합 :" + sum);
    }
}
