package DoIt.chapter09;

import java.util.Comparator;

// 연결 리스트 클래스 (배열 커서 & 원형 리스트 버전)
public class AryCircleLinkedList<E> {

    // 노드
    class Node<E> {
        private E data;    // 데이터
        private int next;  // 레스트의 뒤쪽 포인터 (다음 노드의 index)
        private int dnext; // free 리스트의 뒤쪽 포인터 (다음 노드의 index)

        // data와 next를 결정
        void set(E data, int next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E>[] n; // 리스트 본체
    private int size;    // 리스트의 용량 (가장 큰 데이터 수)
    private int max;     // 사용 중인 꼬리 record
    private int head;    // 머리 노드
    private int tail;    // 꼬리 노드
    private int crnt;    // 선택 노드
    private int deleted; // free 리스트의 머리 노드
    private static final int NULL = -1; // 다음 노드 없음 / 리스트가 가득 참

    // 생성자
    public AryCircleLinkedList(int capacity) {
        head = tail = crnt = max = deleted = NULL;
        try {
           n = new Node[capacity];
           for (int i = 0; i < capacity; i++)
               n[i] = new Node<E>();
           size = capacity;
        } catch (OutOfMemoryError e) { // 배열 생성 실패
            size = 0;
        }
    }

    // 다음에 삽입하는 record의 인덱스를 구함
    private int getInsertIndex() {
        if (deleted == NULL) { // 삭제할 record가 없음
            if (max < size)
                return ++max;  // 새 record를 사용
            else
                return NULL;   // 용량 넘침
        } else {
            int rec = deleted;      // free 리스트에서
            deleted = n[rec].dnext; // 머리 rec를 꺼냄
            return rec;
        }
    }

    // record idx를 free 리스트에 등록
    private void deleteIndex(int idx) {
        if (deleted == NULL) {   // 삭제할 record가 없음
            deleted = idx;       // idx를 free 리스트의
            n[idx].dnext = NULL; // 머리에 등록
        } else {
            int rec = deleted;   // idx를 free 리스트의
            deleted = idx;       // 머리에 삽입
            n[rec].dnext = rec;
        }
    }

    // 노드를 검색
    public E search(E obj, Comparator<? super E> c) {
        if (head != NULL) {
            int ptr = head; // 현재 스캔 중인 노드

            do {
                if (c.compare(obj, n[ptr].data) == 0) {
                    crnt = ptr;
                    return n[ptr].data; // 검색 성공
                }
                ptr = n[ptr].next;      // 다음 노드에 주목
            } while (ptr != NULL);
        }
        return null; // 검색 실패
    }

    // 머리에 노드를 삽입
    public void addFirst(E obj) {
        if (head == NULL) {
            int rec = getInsertIndex();
            if (rec != NULL) {
                head = tail = crnt = rec;
                n[head].set(obj, rec);
            }
        } else {
            int ptr = head;        // 삽입 전의 머리 노드
            int rec = getInsertIndex();
            if (rec != NULL) {
                head = crnt = rec; // 인덱스 rec인 record에 삽입
                n[head].set(obj, ptr);
                n[tail].next = head;
            }
        }
    }

    // 꼬리에 노드를 삽입
    public void addLast(E obj) {
        if (head == NULL) { // 리스트가 비어 있으면
            addFirst(obj);  // 머리에 삽입
        } else {
            int rec = getInsertIndex();
            if (rec != NULL) { // 인덱스 rec인 record에 삽입
                n[tail].next = crnt = rec;
                n[rec].set(obj, head);
                tail = rec;
            }
        }
    }

    // 머리에 노드를 삭제
    public void removeFirst() {
        if (head != NULL) {
            if (head == tail) {
                deleteIndex(head);
                head = tail = crnt = NULL;
            } else {
                int ptr = n[head].next;
                deleteIndex(head);
                head = crnt = ptr;
                n[tail].next = head;
            }
        }
    }

    // 꼬리 노드를 삭제
    public void removeLast() {
        if (head != NULL) {
            if (head == tail) {         // 노드가 하나만 있으면
                removeFirst();          // 머리 노드를 삭제
            } else {
                int ptr = head;         // 스캔 중인 노드
                int pre = head;         // 스캔 중인 노드의 앞쪽 노드

                while (n[ptr].next != head) {
                    pre = ptr;
                    ptr = n[ptr].next;
                }
                n[pre].next = head; // pre는 삭제 후의 꼬리 노드
                deleteIndex(pre);
                tail = crnt = pre;
            }
        }
    }

    // record p를 삭제
    public void remove(int p) {
        if (head != NULL) {
            if (p == head) {   // p가 머리 노드면
                removeFirst(); // 머리 노드를 삭제
            } else if (p == tail) { // p가 꼬리 노드면
                removeLast();       // 꼬리 노드를 삭제
            } else {
                int ptr = head;

                while (n[ptr].next != p) {
                    ptr = n[ptr].next;
                    if (ptr == NULL)
                        return; // p가 리스트에 없습니다.
                }
                n[ptr].next = n[p].next;
                deleteIndex(p);
                crnt = ptr;
            }
        }
    }

    // 선택 노드를 삭제
    public void removeCurrentNode() {
        remove(crnt);
    }

    // 모든 노드를 삭제
    public void clear() {
        while (head != NULL) // 텅 빌 때까지
            removeFirst();   // 머리 노드를 삭제
        crnt = NULL;
    }

    // 선택 노드를 하나 뒤쪽으로 이동
    public boolean next() {
        if (crnt == NULL || n[crnt].next == NULL)
            return false; // 이동할 수 없음
        crnt = n[crnt].next;
        return true;
    }

    // 선택 노드를 출력
    public void printCurrentNode() {
        if (crnt == NULL)
            System.out.println("선택 노드가 없습니다.");
        else
            System.out.println(n[crnt].data.toString());
    }

    // 모든 노드를 출력
    public void dump() {
        if (head != NULL) {
            int ptr = head;

            do {
                System.out.println(n[ptr].data.toString());
                ptr = n[ptr].next;
            } while (ptr != head);
        }
    }

    // comparator c에 의해 서로 같다고 보는 노드를 모두 삭제
    public void purge(Comparator<? super E> c) {
        if (head == NULL)
            return;
        int ptr = head;

        do {
            int count = 0;
            int ptr2 = ptr;
            int pre = ptr;

            while (n[pre].next != head) {
                ptr2 = n[pre].next;
                if (c.compare(n[ptr].data, n[ptr2].data) == 0) {
                    remove(ptr2);
                    count++;
                } else {
                    pre = ptr2;
                }
            }
            if (count == 0) {
                ptr = n[ptr].next;
            } else {
                int temp = n[ptr].next;
                remove(ptr);
                ptr = temp;
            }

        } while (n[ptr].next != head);
        crnt = head;
    }

    // 머리부터 n개 뒤 노드의 데이터에 대한 참조를 반환
    public E retrieve(int n) {
        if (head != NULL) {
            int ptr = head;

            while (n >= 0) {
                if (n-- == 0) {
                    crnt = ptr;
                    return this.n[ptr].data; // 검색 성공
                }
                ptr = this.n[ptr].next; // 뒤쪽 노드에 주목
                if (ptr == head)
                    break;
            }
        }
        return (null);
    }
}
