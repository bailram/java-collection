### Map Interface
- Map adalah struktur data collection yang berisikan mapping antara key dan value
- Dimana key di map itu harus unik, tidak boleh duplikat, dan satu key cuma boleh mapping ke satu value
- Map sebenernya mirip dengan Array, cuma bedanya kalau di Array, key adalah index (integer), sedangkan di Map, key nya bebas kita tentukan sesuai dengan keinginan kita

### Implementasi Map
- Map (I)
  - HashMap (C)
  - WeakHashMap (C)
  - IdentityHashMap (C)
  - LinkedHashMap (C)
  - EnumHashMap (C)

### HashMap
- HashMap adalah implementasi Map yang melakukan distribusi key menggunakan hashCode() function
- Karena HashMap sangat bergantung dengan hashCode() function, jadi pastikan kita harus membuat function hashCode seunik mungkin, karena jika terlalu banyak nilai hashCode() yang sama, maka pendistribusian key nya tidak akan optimal sehingga proses get data di Map akan semakin lambat
- Di HashMap pengecekan data duplikat dilakukan dengan menggunakan method equals nya

### WeakHashMap
- WeakHashMap adalah implementasi Map mirip dengan HashMap
- Yang membedakan adalah WeakHashMap menggunakan weak key, dimana jika tidak digunakan lagi maka akan secara otomatis data di WeakHashMap akan dihapus
- Artinya, jika terjadi garbage collection di Java, bisa memungkinkan data WeakHashMap akan dihapus
- WeakHashMap cocok digunakan untuk menyimpan data cache di memory secara sementara

### IdentityHashMap
- IdentityHAshMap adalah implementasi Map sama seperti HshMap
- Yang membedakan adalah cara pengecekan kesamaan datanya, tidak menggunakan function equals, melainkan menggunakan operator == (referece equality)
- Artinya data dianggap sama, jika memang lokasi di memory tersebut sama

### LinkedHasHMap
- LinkedHashMap adalah implementasi Map dengan menggunakan double linked list
- Data di LinkedHashMap akan lebih terprediksi karena datanya akan disimpan berurutan dalam linked list sesuai urutan kita menyimpan data
- Namun perlu diperhatikan, proses get data di LinkedHashMap akan semakin lambat karena harus melakukan iterasi data linked list terlebih dahulu
- Gunakan LinkedHashMap jika memang kita lebih memntingkan iterasi data Map nya

### EnumMap
- EnumMap adalah implementasi Map dimana key nya adalah enum
- Karena data enum sudah pasti unik, oleh karena itu cocok dijadikan key di Map
- Algoritma pendistribusian key dioptimalkan untuk enum, sehingga lebih optimal dibandingkan menggunakan hashCode() method