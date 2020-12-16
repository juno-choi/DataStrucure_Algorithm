package Search;

import java.util.Scanner;

/**
 * 선형 검색 while
 */
public class SeqSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i=0; i<num; i++){
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색하고자 하는 값 : ");
        int key = sc.nextInt();
        int idx = seqSearch(x, num, key);

        if(idx == -1){
            System.out.println("확인할 수 없는 요소값입니다.");
        }else{
            System.out.println(key+" = x["+idx+"]에 있습니다.");
        }
    }
    static int seqSearch(int[] a, int n, int key){
        int i=0;

        while(true){
            if(i==n){
                return -1;
            }
            if(a[i] == key){
                return i;
            }
            i++;
        }
    }
}
