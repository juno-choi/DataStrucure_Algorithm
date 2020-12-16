package Algorithm;

import java.util.Scanner;

public class Algorithm3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];
        for(int i=0; i<num; i++){
            System.out.println("키 ["+i+"] :");
            height[i] = sc.nextInt();
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
