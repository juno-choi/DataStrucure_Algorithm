package StackQueue;

/**
 * 스택의 기본 구조
 */
public class Stack_1 {
    int max;    //스택의 크기
    int ptr;    //스택의 데이터 크기
    int[] stk;  //스택

    //스택 생성자
    public Stack_1(int capacity) {
        ptr = 0;
        max = capacity;
        try{
            stk = new int[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    /**
     * 스택이 비어 있을 경우
     */
    public class EmptyStackException extends RuntimeException{
        public EmptyStackException(){

        }
    }

    /**
     * 스택이 가득 찼을 경우
     */
    public class OverflowStackException extends RuntimeException{
        public OverflowStackException(){

        }
    }

    /**
     * 스택 데이터 저장
     */
    public int push(int x) throws OverflowStackException{
        if(ptr == max){
            throw new OverflowStackException();
        }
        return stk[ptr++] = x;
    }

    /**
     * 스택 데이터 꺼내기
     */
    public int pop() throws EmptyStackException{
        if (ptr <= 0){
            throw new EmptyStackException();
        }
        return stk[--ptr];
    }

    /**
     * 스택 마지막 데이터를 확인하기 (pop x)
     */
    public int peak() throws EmptyStackException{
        if(ptr <= 0){
            throw new EmptyStackException();
        }
        return stk[ptr - 1];
    }

    /**
     * 스택 검색
     */
    public int indexOf(int x){
        for(int i=ptr-1; i>=0; i--){
            if(stk[i] == x){
                return i;   //검색 결과
            }
        }
        return -1;  //검색 결과가 없을 때
    }

    /**
     * 스택 비우기
     */
    public void clear(){
        ptr = 0;
    }

    /**
     * 스택의 용량
     */
    public int capacity(){
        return max;
    }

    /**
     * 스택의 데이터 크기
     */
    public int size(){
        return ptr;
    }

    /**
     * 스택이 비어있는지
     */
    public boolean isEmpty(){
        return ptr <= 0;
    }

    /**
     * 스택이 가득 찼는지
     */
    public boolean isFull(){
        return ptr >= max;
    }

    /**
     * 스택의 모든 데이터를 출력 바닥->꼭대기 순서
     */
    public void dump(){
        if(ptr<=0){
            System.out.println("스택이 비어 있습니다.");
        }else{
            for(int i=0; i<ptr; i++){
                System.out.print(stk[i]+" ");
            }
            System.out.println();
        }
    }

}
