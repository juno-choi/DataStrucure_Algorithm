package Search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");
        x[0] = sc.nextInt();

        for(int i=1; i<num; i++){
            do{
                System.out.print("x["+i+"] : ");
                x[i] = sc.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = binarySearch(x,num,key);
        if(idx == -1){
            System.out.println("검색하고자 하는 값이 없습니다.");
        }else{
            System.out.println(key+"값은 x["+idx+"]에 있습니다.");
        }
    }

    static int binarySearch(int[] a, int n, int key){
        int pl = 0;     //검색 첫 인덱스
        int pr = n-1;   //검색 끝 인덱스

        do{
            int pc = (pl+pr)/2;
            if(a[pc] == key){
                return pc;
            }else if(a[pc]<key){
                pl=pc+1;
            }else{
                pr=pc-1;
            }

        }while(pl<=pr);
        return -1;
    }
}
