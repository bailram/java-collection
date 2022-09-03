### NavigableSet Interface
- NavigableSet adalah turunan dari SortedSet
- NavigableSet menambahkan method-method untuk melakukan navigasi pencarian element, seperti mencari elemen yang lebih besar dari, kurang dari, membalikkan urutan set, dan lain-lain

### Method di NavigableSet Interface
- NavigableSet
  - SortedSet
      - `lower(E): E`
      - `floor(E): E`
      - `ceiling(E): E`
      - `higher(E): E`
      - `pollFirst(E): E`
      - `pollLast(E): E`
      - `descendingSet(): NavigableSet<E>`
      - `descendingIterator(): Iterator<E>`
      - `subSet(E, boolean, E, boolean): NavigableSet<E>`
      - `headSet(E, boolean): NavigableSet<E>`
      - `tailSet(E, boolean): NavigableSet<E>`

### Implementasi NavigableSet
Iterable (I) <- Collection (I) <- Set (I) <- SortedSet (I) <- MavigableSet (I) <-- TreeSet (C)

### Kode
```java
NavigableSet<String> names = new TreeSet<>();
names.addAll(Set.of("Dhimas", "Bayu"));

NavigableSet<String> namesDesc = names.descendingSet();
NavigableSet<String> bayu = names.headSet("Bayu", true);

for(var name : names) {
    System.out.println(name);
} 
```

### Membuat Immutable NavigableSet
| Method | Keterangan |
| --- | --- |
| Collections.emptyNavigableSet() | Membuat immutable navigable set kosong |
| Collections.unmodifiableNavigableSet(set) | Mengubah mutable navigable set menjadi immutable |