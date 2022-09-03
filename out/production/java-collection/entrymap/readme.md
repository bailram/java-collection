### Entry Interface
- Saat kita menyimpan data di Map, data disimpan dalam pair (key-value)
- Di Java Collection, implementasi Pair di Map bernama Entry
- Entry adalah interface sederhana yang berisikan method untuk mengambil key dan value

### Method di Entry Interface
- Entry
  - Object
    - getKey(): K
    - getValue(): V
    - setValue(): V
    - comparingByKey(): Comparator<Entry<K, V>>
    - comparingByValue(): Comparator<Entry<K, V>>
    - comparingByKey(Comparator<? super K>): Comparator<Entry<K, V>>
    - comparingByValue(Comparator<? super V>): Comparator<Entry<K, V>>