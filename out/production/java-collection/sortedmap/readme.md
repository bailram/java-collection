### SortedMap Interface
- SortedMap adalah implementasi Map dengan data key diurutkan sesuai dengan Comparable key atau bisa menggunakan Comparator
- SortedMap cocok untuk kasus yang posisi key pada Map harus berurut

### Method di SortedMap
- SortedMap
  - Map
    - comparator(): Comparator<? super K>
    - subMap(K, K): SortedMap<K, V>
    - headMap(K): SortedMap<K, V>
    - tailMap(K): SortedMap<K, V>
    - firstKey(): K
    - lastKey(): K

### Implementasi SortedMap
- Map (I)
  - SortedMap (I)
    - TreeMap (C)

### Membuat Immutable SortedMap
| Method | Keterangan |
| --- | --- |
| Collections.emptySortedMap() | Membuat immutable sorted map kosong |
| Collections.unmodifiableSortedMap(map) | Mengubah mutable sorted map menjadi immutable |