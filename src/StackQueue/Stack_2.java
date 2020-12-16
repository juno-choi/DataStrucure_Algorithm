package StackQueue;

import java.util.Scanner;

/**
 * 스택을 사용하는 프로그램
 */
public class Stack_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack_1 s = new Stack_1(64);    //최대 64개의 데이터를 가질 수 있는 stack을 생성

        while(true){
            System.out.println("현재 데이터 수 : "+s.size() + " / "+s.capacity());

            System.out.print("1.push 2.pop 3.peak 4.dump 0.close this program : ");

            int menu = sc.nextInt();
            if(menu == 0 || menu>4) break;
            
            int x = 0;
            switch (menu){
                case 1 :    //push
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try{
                        s.push(x);
                    }catch (Stack_1.OverflowStackException e){
                        System.out.println("스택이 가득찼습니다.");
                    }
                    break;
                    
                case 2 :    //pop
                    try{
                        x = s.pop();
                        System.out.println("pop 데이터 : "+x);
                    }catch (Stack_1.EmptyStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 3 :    //peak
                    try{
                        x = s.peak();
                        System.out.print("peak 결과 : "+x);
                    }catch (Stack_1.EmptyStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4 :    //dump
                    s.dump();
                    break;
            }
            

        }
    }
}
