package DoIt.chapter06;

// int형 고정 길이 스택
public class IntStack {

    private int[] stk;    // 스택용 배열
    private int capacity; // 스택 용량
    private int ptr;      // 스택 포인터

    // 실행 시 에외: 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    // 실행 시 에외: 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    // 생성자
    public IntStack(int maxLen) {
        ptr = 0;
        capacity = maxLen;

        try {
            stk = new int[capacity];   // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) { // 생성 불가
            capacity = 0;
        }
    }

    // 스택에 x를 푸시한다.
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity) // 스택이 가득 참
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(꼭대기의 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) // 스택이 비어있음
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    // 스택에서 데이터를 피크(꼭대기의 데이터를 들여다 봄)
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) // 스택이 비어있음
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    // 스택을 비움
    public void clear() {
        ptr = 0;
    }

    // 스택에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환함
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i] == x)
                return i; // 검색 성공
        return -1;        // 검색 실패
    }

    // 스택 용량을 반환함
    public int getCapacity() {
        return capacity;
    }

    // 스택에 쌓여있는 데이터 갯수를 반환함
    public int size() {
        return ptr;
    }

    // 스택이 비어있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {
        return ptr <= capacity;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력함
    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
        System.out.println();
    }
}
