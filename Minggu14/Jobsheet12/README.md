<h1 align="center">
Laporan Praktikum Jobsheet 12
</h1>
Laporan Praktikum Materi Fungsi 1.   
   
Nama: Dhafir Tsabit    
NIM: 254107020148   
Kelas: TI-1C   
No. Absen: 11   
## Percobaan 1
### Pertanyaan
1. Apakah fungsi tanpa parameter selalu harus bertipe void?   
- Tidak. Kecuali jika fungsi perlu mengembalikan nilai, maka parameter dapat bertipe selain void.   
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!    
- Ya. Daftar menu bisa saja ditampilkan pada fungsi main.
- Modifikasi sudah di-commit pada dengan pesan "Modifikasi Percobaan 2".    
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.    
Keuntungan menggunakan fungsi Menu(), antara lain:    
    1. Alur kode akan lebih terstruktur karena fungsi mengurus tampilan menu secara independen.
    2. Fungsi Menu() dapat dipanggil berkali-kali tanpa harus menulis ulang kode.   
    3. Jika daftar menu berubah sewaktu-waktu, cukup ubah kode di bagian fungsi main().     
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).    
    1. Ketika program dijalankan, eksekusi akan dimulai dari fungsi main
    2. Di dalam main, program memanggil fungsi Menu() lalu eksekusi berpindah ke fungsi Menu().   
    3. Fungsi Menu() akan menjalankan perintah di dalamnya, lalu akan kembali ke fungsi main ketika selesai.   
    4. Program akan melanjutkan ke kode berikutnya sesuai alur.   

## Percobaan 2
### Pertanyaan
1. Apakah kegunaan parameter di dalam fungsi?    
- Parameter berfungsi untuk menginput data ke dalam fungsi.
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?    
- Parameter-parameter tersebut digunakan untuk membedakan output berdasarkan data parameter yang dimasukkan.   
3. Apakah parameter sama dengan variabel? Jelaskan.   
-  Tidak. Parameter didefinisikan di dalam kurung fungsi dan digunakan untuk menerima nilai dari luar saat fungsi dipanggil Sedangkan variabel, dideklarasikan di dalam fungsi atau kelas dan nilainya ditentukan langsung di dalam program.      
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?    
- Jika isMember bernilai true, program akan menampilkan output khusus. Sedangkan jika isMember bernilai false, maka program akan menampilkan output menu biasa.  
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?    
- Program akan mengalami error compiling karena fungsi sudah didefinisikan dengan parameter.   
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.    
```java
void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println("Selamat datang, " + namaPelanggan);
    
    if (isMember) {
        System.out.println("Status: Member");
    } else {
        System.out.println("Status: Non-Member");
    }

    if (kodePromo.equals("DISKON50")) {
        System.out.println("Promo berlaku: Diskon 50%");
    } else if (kodePromo.equals("DISKON30")) {
        System.out.println("Promo berlaku: Diskon 30%");
    } else {
        System.out.println("Kode promo invalid");
    }
}
```
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.    
```java
Menu("Budi", true, "DISKON30");
```
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember 
pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan 
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.   
- Ya. Alur program menjadi lebih jelas, lebih rapi, dan lebih fleksibel serta dapat dengan mudah dimodifikasi.   
     
## Percobaan 3   
### Pertanyaan
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.    
- Fungsi membutuhkan nilai return ketika hasil dari fungsi akan dipakai lagi di program. Contoh:   
```java
int hitungTotalHarga11(int pilihanMenu, int jumlahPesanan) {
    int[] hargaMenu = {10000, 15000, 20000};
    return hargaMenu[pilihanMenu - 1] * jumlahPesanan;
}
```   
- Fungsi tidak membutuhkan niai return apabila hasil dari fungsi tidak akan dipakai lagi atau fungsi hanya menjalankan instruksi tanpa nilai kembalian. Contoh:
```java
void tampilMenu() {
    System.out.println("1. Kopi Hitam");
    System.out.println("2. Cappuccino");
    System.out.println("3. Latte");
}
```   
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.    
- Tipe data nilai kembalian: integer
- Parameter: (1) pilihanMenu untuk menunjukkan menu; (2) jumlahPesanan untuk menunjukkan jumlah pesanan.
- Dalam konteks program kafe, fungsi akan mencari harga dari menu yang dipilih, lalu mengalikan dengan jumlah pesanan untuk menghasilkan total harga.   
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.    
```java
int hitungTotalHarga11(int pilihanMenu, int jumlahPesanan, String kodePromo) {
    int[] hargaMenu = {10000, 15000, 20000};
    int totalHarga = hargaMenu[pilihanMenu - 1] * jumlahPesanan;

    if (kodePromo.equals("DISKON50")) {
        System.out.println("Promo berlaku: Diskon 50%");
        totalHarga = totalHarga - (totalHarga * 50 / 100);
    } else if (kodePromo.equals("DISKON30")) {
        System.out.println("Promo berlaku: Diskon 30%");
        totalHarga = totalHarga - (totalHarga * 30 / 100);
    } else {
        System.out.println("Kode promo invalid");
    }

    return totalHarga;
}
```
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?     
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Menu();
        
    System.out.print("\nBerapa jenis menu yang ingin Anda pesan?: ");
    int n = sc.nextInt();

    int[] pilihanMenu = new int[n];
    int[] jumlahPesanan = new int[n];

    for (int i = 0; i < n; i++) {
        System.out.print("\nPesanan ke-" + (i+1) + " pilih nomor menu: ");
        pilihanMenu[i] = sc.nextInt();
        System.out.print("Masukkan jumlah item: ");
        jumlahPesanan[i] = sc.nextInt();
    }

    sc.nextLine();
    System.out.print("Masukkan kode promo: ");
    String kodePromo = sc.nextLine();
    int totalHarga = hitungTotalHarga11(pilihanMenu, jumlahPesanan, kodePromo);

    System.out.println("Total harga untuk pesanan Anda: Rp" totalHarga);
}
```
## Percobaan 4
### Pertanyaan
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!    
- String...namaPengunjung adalah variable arguments. Dengan demikian, fungsi dapat menerima input parameter namaPengunjung lebih dari satu.   
2. Modifikasi method daftarPengunjung menggunakan for-each loop.   
```java
public static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Pengunjung:");
    for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
    }
}
```   
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!    
- Tidak bisa. Dalam satu fungsi hanya bisa menggunakan satu varargs. Selebih itu, program akan mengalami error compiling.   
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen.Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?   
- Fungsi akan tetap berjalan tetapi tidak ada data yang ditampilkan.   

## Percobaan 5
### Pertanyaan
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!    
    1. Program dijalankan dan dimulai dari fungsi main.
    2. User memasukkan nilai-nilai yang diminta.
    3. Memanggil fungsi hitungLuas, lalu program menghitung luas persegi panjang.
    4. Memanggil fungsi hitungVolume, lalu program menghitung volume balok.
    5. Program kembali ke main dan menampilkan perhitungan.   
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.    
Output yang dihasilkan:    
- Luas persegi panjang = 12    
- Volume balok = 60   
Alur:    
    1. Input panjang, lebar, tinggi
    2. Memanggil fungsi hitungLuas dan menghasilkan 12
    3. Memanggil fungsi hitungVolume dan menghasilkan 60
    4. Output hasil   

3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!   
    1. Program dijalankan dari fungsi main
    2. Memanggil fungsi Jumlah(1, 1), lalu mengembalikan nilai 2 dan dimasukkan ke dalam variabel temp.
    3. Memanggil fungsi TampilJumlah(temp, 5) yang berarti (2, 5).
    4. Di dalam fungsi TampilJumlah, dipanggil fungsi TampilHinggaKei(Jumlah(2, 5)) menghasilkan nilai i = 7.
    5. Fungsi TampilHinggaKei melakukan perulangan yang menampilkan bilangan "1234567".   