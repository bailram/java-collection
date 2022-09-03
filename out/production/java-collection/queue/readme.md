### Queue Interface
- Queue adalah implementasi dari struktur data Antrian atau FIFO (First In First Out)

### Method di Queue Interface
- Queue
  - Collection
    - offer(E): boolean
    - remove(): E
    - poll(): E
    - element(): E
    - peek(): E

### Implementasi Queue
- Iterable (I)
  - Collection (I)
    - Queue (I)
      - Deque (I)
        - LinkedList (C)
        - ArrayDeque (C)
      - PriorityQueue (I)

### ArrayDeque vs LinkedList vs PriorityQueue
- ArrayDeque menggunakan array sebagai implementasi queue nya
- LinkedList menggunakan double linked list sebagai implementasi queue nya
- PriorityQueue menggunakan array sebagai implementasi queue nya, namun diurutkan menggunakan Comparable atau Comparator

