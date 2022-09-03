### Legacy Collection
- Collection sudah ada sejak Java versi 1. namun semakin kesini, Java Collection semakin berkembang
- Sebenarnya ada beberapa legacy collection (collection jadul) yang belum kita bahas, namun jarang sekali digunakan sekarang ini

### Vector Class
- Vector class adalah implementasi dari interface List
- Cara kerja Vector mirip dengan ArrayList, yang membedakan adalah semua method di Vector menggunakan kata kunci synchronized yang artinya thread safe
- Namun problemnya adalah, karena semua method menggunakan kata kunci synchronized, secara otomatis impact nya ke performance yang menjadi lambat dibandingkan ArrayList
- Lantas bagaimana jika kita ingin membuat List yang bisa digunakan di proses paralel? Di versi Java baru, sudah disediakan yang lebih canggih untuk itu, oleh karena itu penggunaan Vector sudah jarang sekali ditemui sekarang

### HashTable Class
- HashTable adalah implementasi dari Map yang mirip dengan HashMap
- Sama seperti Vector, semua method di HashTable memiliki kata kunci synchronized, sehingga performanya lebih lambat dibandingkan HashMap
- Dan karena di versi Java baru sudah ada juga ConcurrentHashMap, sehingga penggunaan HashTable sudha jarang sekali ditemui

### Stack Class
- Stack adalah implementasi struktur data tumpukan LIFO (Last In First Out)
- Namun fitur yang lebih komplit dan konsisten sudah disediakan di Deque, jadi tidak ada alasan lagi menggunakan class Stack