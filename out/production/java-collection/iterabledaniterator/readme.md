## Iterable interface
- Iterable adalah parent untuk semua collection di Java, kecuali Map
- Iterable sendiri sangat sederhana, hanya digunakan agar mendukung for-each loop
- Karena semua collection pasti implement Iterable, secara otomatis maka semua collection di Java mendukung perulangan for-each, jadi bukan cuma Array

## Iterator Inteface
- Tidak ada magic di Java, sebenernya for-each di Iterable bisa terjadi karena ada method iterator() yang mengembalikan object iterator
- Iterator adalah interface yang mendefinisikan cara kita melakukan akses element di collection secara sequential
- For-each sendiri muncul sejak Java 5, sebelum Java 5 untuk melakukan iterasi collection itu biasanya dilakukan manual menggunakan iterator object