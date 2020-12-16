package Algorithm;

import java.util.Random;
import java.util.Scanner;

public class Algorithm3_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];
        for(int i=0; i<num; i++){
            height[i] = 100+rand.nextInt(90);
            System.out.println("키 ["+i+"] : "+ height[i]);
        }
        System.out.println("총 "+num+"명 중 가장 큰 키 값은 "+maxOf(height));
    }

    static int maxOf(int[] a){
        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>max) max = a[i];
        }
        return max;
    }
}
