### Sorting
- Sorting atau pengurutan adalah algoritma yang sudah biasa kita lakukan
- Di Java Collection juga sudah disediakan cara untuk melakukan pengurutan, jadi kita tidak perlu melakukan pengurutan secara manual
- Namun perlu diingat, yang bisa di sort hanyalah List, karena Set, Qeueu, Deque dan Map cara kerjanya sudah khusus, jadi pengurutan hanya bisa dilakukan di List

### Sorting di List
| Method | Keterangan |
| --- | --- |
| Collections.sort(list) | Mengurutkan list dengan comparable bawaan element |
| Collections.sort(list, comparator) | Mengurutkan list dengan comparator |