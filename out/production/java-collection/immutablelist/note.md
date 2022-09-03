### Immutable List
- secara default, List di Java baik itu ArrayList ataupun LinkedList datanya bersifat mutable (Bisa diubah)
- Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi 
- Sekali List dibuat, datanya tidak bisa diubah lagi, alias final
- Tapi ingat, data list nya yang tidak bisa diubah, bukan reference object element nya. Kalau misal kiat membuat immutable List berisikan data Person, field data person tetap bisa diubah, tapi isi elemen dari immutable List tidak bisa diubah lagi
- Ini cocok ketika kasus-kasus misal, tidak sembarangan code yang boleh mengubah element di List

### Membuat Immutable List
| Method | Keterangan |
|---|---|
| Collections.emptyList() | Membuat immutable list kosong |
| Collections.singletonList(e) | Membuat immutable list berisi 1 element |
| Collections.unmodifiableList(list) | Mengubah mutable list menjadi immutable |
| List.of(e...) | Membuat immutable list dari element - element |
