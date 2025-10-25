# Laporan Jobsheet 7: Perulangan   
Nama: Dhafir Tsabit    
NIM : 254107020148   
Kelas: TI-1C   
No. Absen: 11   
### Percobaan 1   
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!     
    - Inisialisasi 'int i = 1': Inisialisasi yang dilakukan sekali di awal. Variabel i bernilai awal 1 yang berarti perulangan dimulai dari mahasiswa ke-1.   
    - Kondisi 'i <= 10': Evaluasi nilai variabel. Jika variabel bernilai 'true', maka blok kode dalam {} akan dijalankan.
    - Update 'i++/i--': Menambah nilai i sebanyak 1 setelah satu putaran perulangan selesai.     
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?    
    - tertinggi = 0 : Karena nilai yang dicari adalah nilai terbesar, maka dimulai dari angka paling kecil yang mungkin di-inputkan.   
    - terendah = 100: Karena yang dicari adalah nilai terkecil, maka dimulai dari angka paling kecil yang mungkin diinputkan.   
    - tertinggi = 100 : Kondisi ini hanya akan mengganti nilai 'tertinggi' jika input lebih besar dari 100. Namun, karena nilai mahasiswa biasanya <= 100, maka output tetap menampilkan 100.      
    - terendah = 0 : Kondisi ini hanya akan mengganti nilai 'terendah' jika input lebih kecil dari 0. Namun, karena nilai mahasiswa biasanya >= 0, maka output tetap menampilkan 0.  
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut! 
        if (nilai > tertinggi) {
            tertinggi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }   
    Fungsi dari potongan kode tersebut adalah untuk menentukan nilai tertinggi dan nilai terendah. Adapun alurnya adalah sebagai berikut:   
    1. Variabel 'tertinggi' diatur ke nilai terkecil yang mungkin agar nilai input pertama langsung menggantikan nilai variabel tersebut. Sedangkan variabel 'terendah' diatur ke nilai terbesar yang mungkin agar nilai dari input pertama langsung menggantikan nilai variabel tersebut.
    2. Perulangan akan membandingkan input 'nilai' dengan tertinggi dan terendah.
    3. Kondisi pada IF pertama: Jika 'nilai' lebih besar dari 'tertinggi', maka 'tertinggi' akan diperbarui.
    4. Kondisi pada IF kedua: Jika 'nilai' lebih kecil dari 'terkecil', maka 'terkecil' akan diperbarui.    
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa 
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). 
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi 
dan terendah! 
5. Commit dan push kode program ke Github    
   
### Percobaan 2   
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut: 
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
            continue;
        }
a. nilai < 0 || nilai > 100    
    Sintaks di atas berfungsi untuk mengevaluasi apakah nilai berada di rentang 0-100. Jika 'nilai' kurang dari 0 atau 'nilai' lebih dari 100, maka nilai tidak valid dan program akan menampilkan teks.
b. continue    
    Sintaks ini berfungsi agar input yang tidak valid tidak diproses di kode berikutnya dan program akan langsung mengulang ke bagian input nilai.
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?    
    - Sintaks i++ ditulis di akhir perulangan WHILE berarti data pada i akan diproses terlebih dahulu lalu nilai i ditambah. Perulangan i=0 akan dijalankan terlebih dahulu lalu i ditambah menjadi i=1.
    - Jika sintaks i++ diletakkan di awal, maka nilai i ditambah terlebih dahulu lalu kode diproses. Ini berarti program tidak menjalankan kode pada indeks i awal dan langsung menajalankan kode pada indeks selanjutnya.
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?    
    Perulangan akan dijalankan 19 kali dari i=0 sampai i kurang dari 19.
4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"! 
5. Commit dan push kode program ke Github
   
### Percobaan 3      
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?    
    Program hanya akan menjalankan blok 'do' sekali dan perulangan tidak diulang lagi.
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!    
    Perulangan DO-WHILE akan berhenti jika user mengetik "batal" karena kondisi IF (namaPelanggan.equalsIgnoreCase("batal")) terpenuhi. Selain itu, di dalam blok kode IF terdapat sintaks 'break' yang akan menghentikan perulangan secara paksa.
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?   
    Penggunaan nilai true pada kondisi DO-WHILE berfungsi untuk membuat perulangan berjalan terus-menerus sampai diberhentikan secara manual dengan mekanisme seperti break, return, dll.
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?    
    Perulangan DO-WHILE tidak membutuhkan inisialisasi atau update. Selain itu, perulangan ini berjalan karena menggunakan kondisi true dan tidak ada batasan tertentu.