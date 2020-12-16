package Search;

import java.util.Scanner;

/**
 * 선형 검색 for
 */
public class SeqSearchSen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num+1];

        for(int i=0; i<num; i++){
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색하고자 하는 값 : ");
        int key = sc.nextInt();
        int idx = seqSearchSen(x, num, key);

        if(idx == -1){
            System.out.println("확인할 수 없는 요소값입니다.");
        }else{
            System.out.println(key+" = x["+idx+"]에 있습니다.");
        }
    }
    static int seqSearchSen(int[] a, int n, int key){
        int i=0;

        a[n] = key; //보초 추가

        while(true){
            if(a[i] == key){
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }
}
