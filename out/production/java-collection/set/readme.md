### Set Interface
- Set adalah salah satu collection yang berisikan elemen-elemen yang unik, atau tidak boleh duplicate
- Set tidak memiliki index seperti di List, oleh karena itu tidak ada jaminan data yang ada di Set itu akan terurut sesuai dengan waktu kita memasukkan data ke Set
- Set tidak memiliki method baru, jadi hanya menggunakan method yang ada di interface parent nya, yaitu Collection dan iterable
- Karena tidak memiliki index, untuk mengambil data di Set juga kita harus melakukan iterasi satu per satu

### Hashset vs LinkedHashSet
- Di belakang HashSet dan LinkedHAshSet sebenernya sama-sama ada hash table, dimana data disimpan dalam sebuah hash table dengan mengkalkulasi hashCode() function
- Yang membedakan adalah, Hashset tidak menjamin data terurut sesuai dengan waktu kita menambahkan data, sedangkan LinkedHashSet menjamin data terurut sesuai dengan wktu kita menambahkan data
- Urutan data di LinkedHashSet bisa dijaga karena dibalakang nya menggunakna double linked list

### EnumSet
- EnumSet adalah Set yang elemen datanya harus Enum
- Karena data enum itu unik, sehingga sangat cocok menggunakan Set dibandingkan List 