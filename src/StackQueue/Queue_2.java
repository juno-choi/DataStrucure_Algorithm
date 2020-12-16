package StackQueue;

import java.util.Scanner;

/**
 * 큐을 사용하는 프로그램
 */
public class Queue_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quque_1 s = new Quque_1(64); //최대 64개 인큐가 가능한 큐 생성

        while(true){
            System.out.println("현재 데이터 수 : "+s.size() + " / "+s.capacity());

            System.out.print("1.enque 2.deque 3.peak 4.dump 0.close this program : ");

            int menu = sc.nextInt();
            if(menu == 0 || menu>4) break;
            
            int x = 0;
            switch (menu){
                case 1 :    //enque
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try{
                        s.enque(x);
                    }catch (Quque_1.OverflowQueueexception e){
                        System.out.println("큐가 가득찼습니다.");
                    }
                    break;
                    
                case 2 :    //deque
                    try{
                        x = s.deque();
                        System.out.println("pop 데이터 : "+x);
                    }catch (Quque_1.EmptyQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 3 :    //peak
                    try{
                        x = s.peak();
                        System.out.print("peak 결과 : "+x);
                    }catch (Quque_1.EmptyQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 4 :    //dump
                    s.dump();
                    break;
            }
            

        }
    }
}
