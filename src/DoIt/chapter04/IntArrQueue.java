package DoIt.chapter04;

// int형 배열로 Queue 구현
public class IntArrQueue {

    private int[] que;      // 큐의 본체
    private int capacity;   // 큐의 용량
    private int num;        // 현재 데이터 개수

    // 실행 시 예외 - 큐가 비어 있음
    public class EmptyIntArrQueueException extends RuntimeException {
        public EmptyIntArrQueueException() {}
    }

    // 실행 시 예외 - 큐가 가득 참
    public class OverflowIntArrQueueException extends RuntimeException {
        public OverflowIntArrQueueException() {}
    }

    // 생성자
    public IntArrQueue(int max) {
        num = 0;
        capacity = max;
        try {
            que = new int[capacity];   // 큐 본체용 배열 생성
        } catch (OutOfMemoryError e) { // 생성 불가
            capacity = 0;
        }
    }

    // 큐에 데이터 삽입
    public int enqueue(int x) throws OverflowIntArrQueueException {
        if (num >= capacity) // 큐가 가득참
            throw new OverflowIntArrQueueException();
        que[num++] = x;
        return x;
    }

    // 큐에서 데이터 삭제
    public int dequeue() throws EmptyIntArrQueueException {
        if (num <= 0) // 큐가 비어있음
            throw new EmptyIntArrQueueException();

        int x = que[0];
        for (int i = 0; i < num - 1; i++)
            que[i] = que[i + 1];
        num--;
        return x;
    }

    // 큐에서 데이터를 피크(맨 앞 데이터를 들여다 봄)
    public int peek() throws EmptyIntArrQueueException {
        if (num <= 0) // 큐가 비어있음
            throw new EmptyIntArrQueueException();
        return que[num - 1];
    }

    // 큐에서 x를 검색하여 인덱스(없으면 -1) 반환
    public int indexOf(int x) {
        for (int i = 0; i < num ; i++)
            if (que[i] == x) return i; // 검색 성공
        return -1; // 검색 실패
    }

    // 큐 비우기
    public void clear() {
        num = 0;
    }

    // 큐의 용량을 반환
    public int capacity() {
        return capacity;
    }

    // 큐에 쌓여있는 데이터의 수를 반환
    public int size() {
        return num;
    }

    // 큐가 비어 있는지 반환
    public boolean isEmpty() {
        return num <= 0;
    }

    // 큐가 가득 찼는지 반환
    public boolean isFull() {
        return num >= capacity;
    }

    // 큐 안의 모든 데이터를 맨 앞부터 순서대로 출력
    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }
}
