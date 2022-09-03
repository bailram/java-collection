### Spliterator Interface
- Spliterator adalah interface yang bisa digunakan untuk melakukan partisi data collection
- Biasanya ini digunakan ketika kita akan memproses collection dalam jumlah besar, lalu agar lebih cepat di split menjadi beberapa dan di proses secara paralel agar lebih cepat
- Penggunaan Spliterator biasanya erat kaitannya dengan java Thread atau Java Concurrency, namun di materi ini kita tidak akan membahas tentang itu, lebih fokus ke Spliterator

### Method di Spliterator
- Spliterator
  - ofPrimitive
  - ofInt
  - ofLong
  - ofDouble
  - tryAdvance(Consumer<? super T>): boolean
  - forEachRemaining(Consumer<? super T>): void
  - trySplit(): Spliterator<T>
  - estimateSize(): long
  - getExactSizeIfKnown(): long
  - characteristics(): int
  - hasCharacteristics(int): boolean
  - getComparator(): Comparator<? super T>
  - ORDERED: int = 0x00000010
  - DISTINCT: int = 0x00000001
  - SORTED: int = 0x00000004
  - SIZED: int = 0x00000040
  - NONNULL: int = 0x00000100
  - IMMUTABLE: int = 0x00000400
  - CONCURRENT: int = 0x00001000
  - SUBSIZED: int = 0x00004000