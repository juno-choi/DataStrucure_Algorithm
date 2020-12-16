package StackQueue;

/**
 * 링 버퍼를 사용한 큐(queue) 구현
 */
public class Quque_1 {
    private int max;    //큐의 용량
    private int front;  //큐의 배열 첫번째 커서
    private int rear;   //큐의 배열 마지막 커서
    private int num;    //현재 데이터 수
    private int[] que;  //큐

    /**
     * 큐가 비어있을 때
     */
    public class EmptyQueueException extends RuntimeException{
        public EmptyQueueException(){
            
        }
    }

    /**
     * 큐가 가득 찼을 때
     */
    public class OverflowQueueexception extends RuntimeException{
        public OverflowQueueexception(){
            
        }
    }

    /**
     * 생성자
     */
    public Quque_1(int capacity) {
        num = 0;
        front = 0;
        rear = 0;
        max = capacity;
        try{
            que = new int[max];         //큐 생성
        }catch (OutOfMemoryError e){    //용량을 초과했을 때
            max = 0;
        }
    }

    /**
     * 큐에 데이터를 인큐
     */
    public int enque(int x) throws OverflowQueueexception {
        if(num >= max) throw new OverflowQueueexception();  //큐가 가득 참
        que[rear++] = x;            //큐의 값을 넣어주고 rear 값을 1증가
        num++;                      //데이터의 수 1증가
        if(rear == max) rear = 0;   //rear가 배열의 용량과 같다면 0으로 초기화
        return x;
    }

    /**
     * 큐에 데이터를 디큐
     */
    public int deque() throws EmptyQueueException {
        if(num <= 0) throw new EmptyQueueException();   //큐가 비었음
        int x = que[front++];           //큐의 값을 가져오고 front 값을 1증가
        num--;                          //데이터의 수 1감소
        if(front == max) front = 0;     //front가 배열의 용량과 같다면 0으로 초기화
        return x;
    }

    /**
     * 큐에 데이터를 확인함 (front값 기준)
     */
    public int peak() throws EmptyQueueException {
        if(num <= 0) throw new EmptyQueueException();
        return que[front];
    }

    /**
     * 큐에 데이터를 검색 (실패시 -1 반환)
     */
    public int indexOf(int x){
        for(int i=0; i<num; i++){
            /**
             * front 값부터 차례대로 검색하지만
             * i가 num까지 반복된다면 max값을 넘는 배열을 검색하게 되고
             * 증가만 하기 때문에 front값이 max값을 넘겨서 검색하게 됩니다.
             * 하지만 max로 나눈 나머지로 검색하게 되면 링 버퍼를 front 기준으로
             * front부터 검색하고 그 뒤로 max값을 넘어가게되면 0부터 다시 검색을 실행합니다.
             */
            int idx = (i+front) % max;
            if(que[idx] == x){
                return idx;
            }
        }
        return -1;  //검색 실패
    }

    /**
     * 큐 초기화
     */
    public void clear(){
        num = 0;
        front = 0;
        rear = 0;
    }

    /**
     * 큐 용량
     */
    public int capacity(){
        return max;
    }

    /**
     * 큐에 쌓여있는 데이터 수 반환
     */
    public int size(){
        return num;
    }

    /**
     * 큐가 비어있는지 검사
     */
    public boolean isEmpty(){
        return num <= 0;
    }

    /**
     * 큐가 가득찼는지 검사
     */
    public boolean isFull(){
        return num >= max;
    }

    /**
     * 큐의 데이터를 front -> rear순서로 모두 출력
     */
    public void dump(){
        if(num <= 0) System.out.println("큐가 비어있습니다.");
        else{
            for(int i=0; i<num; i++){
                System.out.print(que[(i+front) % max]+" ");
            }
            System.out.println();
        }
    }

}
