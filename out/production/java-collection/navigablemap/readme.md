### NavigableMap Interface
- NavigableMap adalah turunan dari SortedMap
- Namun NavigableMap memiliki kemampuan navigasi berdasarkan operasi kurang dari, lebih dari dan sejenisnya
- Misal, kita ingin mengambil data yang lebih dari key x atau kurang dari key y, ini bisa dilakukan di NavigableMap

### Method di NavigableMap
- NavigableMap
  - SortedMap
    - lowerEntry(K): Entry<K, V>
    - lowerKey(K): K
    - floorEntry(K): K
    - ceilingEntry(K): Entry<K, V>
    - ceilingKey(K): K
    - higherEntry(K): Entry<K, V>
    - higherKey(K): K
    - firstEntry(K): Entry<K, V>
    - lastEntry(K): Entry<K, V>
    - pollFirstEntry(K): Entry<K, V>
    - pollLastEntry(K): Entry<K, V>
    - descendingMap(): NavigableMap<K, V>
    - navigableKeySet(): NavigableSet<K>
    - descendingKeySet(): NavigableSet<K>
    - subMap(K, boolean, K, boolean): NavigableMap<K, V>
    - headMap(K, boolean): NavigableMap<K, V>
    - tailMap(K, boolean): NavigableMap<K, V>

### Implementasi NavigableMap
- Map (I)
  - SortedMap (I)
    - NavigableMap (I)
      - TreeMap (C)

### Membuat Immutable NavigableMap
| Method | Keterangan |
| --- | --- |
| Collections.emptyNavigableMap() | Membuat immutable navigable map kosong |
| Collections.unmodifiableNavigableMap(map) | Mengubah mutable navigable map menjadi immutable |