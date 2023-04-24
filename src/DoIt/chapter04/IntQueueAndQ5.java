package DoIt.chapter04;

// int형 큐
public class IntQueueAndQ5 {

    private int max;   // 큐의 용량
    private int front; // 첫 번째 요소의 커서
    private int rear;  // 마지막 요소의 커서
    private int num;   // 현재 데이터 개수
    private int[] que; // 큐의 본체

    // 실행 시 예외 - 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    // 실행 시 예외 - 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    // 생성자
    public IntQueueAndQ5(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];        // 큐 본체용 배열 생성
        } catch (OutOfMemoryError e) { // 생성 불가
            max = 0;
        }
    }

    // 큐에 데이터 삽입
    public int enqueue(int x) throws OverflowIntQueueException {
        if (num >= max) // 큐가 가득 참
            throw new OverflowIntQueueException();

        que[rear++] = x; // 마지막 요소보다 하나 더 큰 인덱스에 해당 값 추가
        num++; // 현재 데이터 개수 증가
        if (rear == max) rear = 0; // 큐가 다 차면 rear를 배열의 처음인 0으로 변경
        return x;
    }

    // 큐에서 데이터 삭제
    public int dequeue() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();

        int x = que[front++]; // x에 두 번째 요소를 할당
        num--; // 현재 데이터 개수 감소
        if (front == max) front = 0; // 첫 번째 요소의 커서가 큐의 용량과 같아지면 배열의 처음인 0으로 변경
        return x;
    }

    // 큐에서 데이터를 피크(front를 들여다 봄)
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) // 큐가 비어 있음
            throw new EmptyIntQueueException();
        return que[front];
    }

    // 큐에서 x를 검색하여 인덱스(없으면 -1) 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;
            if (que[idx] == x) return idx; // 검색 성공
        }
        return -1; // 검색 실패
    }

    // 큐 비우기
    public void clear() {
        num = front = rear = 0;
    }

    // 큐의 용량을 반환
    public int capacity() {
        return max;
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
        return num >= max;
    }

    // 큐 안의 모든 데이터를 front -> rear 순서대로 출력
    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++)
                System.out.print(que[(i + front) % max] + " ");
            System.out.println();
        }
    }

    // 큐 안에서 몇 번째에 있는지 양수(실패하면 0) 반환
    public int search(int x) {
        for (int i = 0; i < num; i++)
            if (que[(i + front) % max] == x)
                return i + 1; // 검색 성공
        return -1; // 검색 실패
    }
}
