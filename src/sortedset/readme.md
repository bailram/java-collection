### SortedSet Interface
- SortedSet adalah turunan dari Set, namun di SortedSet elemen-elemen yang dimasukkan kedalam SortedSet akan otomatis diurutkan
- Jika element adalah turunan dari interface Comparable, maka secara otomatis akan diurutkan menggunakan comparable tersebut
- Jika element bukan turunan dari interface Comparable, maka kita bisa menggunakan Comparator untuk memberi tahu si SortedSet bagaimana cara mengurutkan elemen-elemen nya

### Method di SortedSet Interface
- Set
  - `comparator(): Comparator<? super E>`
  - `subSet(E, E): SortedSet<E>`
  - `headSet(E): SortedSet<E>`
  - `tailSet(E): SortedSet<E>`
  - `first()`
  - `last()`
 
### Membuat immutable SortedSet
| Method | Keterangan |
| --- | --- |
| Collections.emptySortedSet() | Membuat immutable sorted set kosong |
| Collections.unmodifiableSortedSet() | Mengubah mutable sorted set menjadi immutable |