package data_structure;

public class PrimNumber3 {

    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;   //2 소수이므로
        prime[ptr++] = 3;   //3 소수이므로

        for(int n=5; n<=1000; n+=2){    //대상은 홀수만
            boolean flag = false;

            for(int i=1; prime[i] * prime[i] <= n; i++){
                counter+=2;
                if(n%prime[i] == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                prime[ptr++] = n;
                counter++;
            }
        }

        for(int i=0; i<ptr; i++){
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈 실행 횟수 : "+counter);
    }

}
