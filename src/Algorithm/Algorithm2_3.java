package Algorithm;

import java.util.Scanner;

public class Algorithm2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지 합");

        int n;

        do{
            System.out.print("n : ");
            n = sc.nextInt();
        }while(n<=0);

        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합 :" + sum);
    }
}
