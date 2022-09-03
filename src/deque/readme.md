### Deque Interface
- Deque singkatan dari double ended queue, artinya queue yang bisa beroperasi dari depan atau belakang
- Jika pada queue, operasi yang didukung ada FIFO, namun pada deque, tidak hanya FIFO, namun juga mendukung LIFO (Last In Last Out)
- Bisa dibilang deque adalah implementasi struktur data antrian dan stact (tumpukan)

### Method di Deque
- Deque
  - Queue
  - Collection
    - addFirst(E): void
    - addLast(E): void
    - offerFirst(E): boolean
    - offerLast(E): boolean
    - removefirst(): E
    - removeLast(): E
    - pollFirst(): E
    - pollLast(): E
    - getFirst(): E
    - getLast(): E
    - peekFirst(): E
    - peekLast(): E
    - removeFirstOccurrence(Object): boolean
    - removeLastOccurrence(Object): boolean
    - push(E): void
    - pop(): E
    - descendingIterator(): Iterator<E>

### Implementasi Deque
- Iterable
  - Collection
    - Queue
      - Deque
        - LinkedList
        - ArrayDeque