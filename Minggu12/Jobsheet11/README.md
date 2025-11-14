<h1 align="center">
Laporan Praktikum Jobsheet 11
</h1>
Laporan Praktikum Materi Array 2 Dimensi.   
   
Nama: Dhafir Tsabit    
NIM: 254107020148   
Kelas: TI-1C   
No. Absen: 11   
## Percobaan 1
### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!   
* Tidak harus. Pengisian array tetap bisa dilakukan secara acak asalkan. indeks elemen tidak menyalahi aturan atau di luar batas ukuran array.   
2. Mengapa terdapat null pada daftar nama penonton?   
* Karena elemen array tersebut belum diisi.   
3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut
```java
penonton[0][0] = "Amin";
penonton[0][1] = "Bena";
penonton[1][0] = "Candra";
penonton[1][1] = "Dela";
penonton[2][0] = "Eka";
penonton[2][1] = "Farhan";
penonton[3][0] = "Gisel";
penonton[3][1] = "Hana";
```
4. Tambahkan kode program sebagai berikut:     
```java
System.out.println(penonton.length);
System.out.println(penonton[0].length);
System.out.println(penonton[1].length);
System.out.println(penonton[2].length);
System.out.println(penonton[3].length);
```    
5. Jelaskan fungsi dari penonton.length dan penonton[0].length!      
Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?     
* penonton.length berfungsi untuk mengetahui ukuran baris array sedangkan penonton[0].length berfungsi unntuk mengetahui ukuran kolom array. 
* Ya. Karena array 'penonton' dibuat dengan ukuran tetap sehingga ukuran kolomnya sama.
10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?    
foreach loop:    
* Kelebihan:   
    - Lebih sederhana
    - Resiko kesalahan indeks rendah
    - Cocok untuk membaca semua elemen
* Kekurangan:   
    - Tidak bisa akses indeks langsung
    - Tidak bisa modifikasi array primitif
    - Kurang fleksibel
for loop:    
* Kelebihan:   
    - Dapat mengontrol indeks
    - Sangat fleksibel
* Kekurangan:   
    - Lebih panjang
    - Kurang efisien

11. Berapa indeks baris maksimal untuk array penonton?    
* 4   
12. Berapa indeks kolom maksimal untuk array penonton?    
* 2   
13. Apa fungsi dari String.join()?    
* Untuk menggabungkan beberapa string menjadi satu string dengan pemisah tertentu.

## Percobaan 2
### Pertanyaan
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!    
* Tidak, selama indeks valid dan dalam batas ukuran, maka pengisian elemen bisa dimulai dari indeks manapun kecuali jika ingin menampilkan secara berurutan.
2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:   
- Menu 1: Input data penonton 
- Menu 2: Tampilkan daftar penonton 
- Menu 3: Exit 
3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia 
4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali  
5. Pada menu 2, jika kursi kosong, ganti null dengan ***     
     
## Percobaan 3   
### Pertanyaan
1. Tambahkan kode program sebagai berikut    
```java
for (int i = 0; i < myNumbers.length; i++) {
    System.out.println(Arrays.toString(myNumbers[i]));
}
```    
2. Apa fungsi dari Arrays.toString()?    
* Mengubah array menjadi String agar mudah dibaca.
3. Apa nilai default untuk elemen pada array dengan tipe data int?    
* Nilai default-nya adalah 0.
4. Tambahkan kode program berikut    
```java
for (int i = 0; i < myNumbers.length; i++) {
    System.out.println("Panjang baris ke-"+(i+1)+": "+myNumbers[i].length);
}
```    
5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?   
* Tidak. panjang array tidak dapat diubah setelah instansiasi.    
     
## Percobaan 4
### Pertanyaan
1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah yang dinamis.    
* [Modifikasi Percobaan 4](file:///C:\Users\DHAFIR\Documents\DasproSMT1\Git-Daspro\PraktikumDaspro\Minggu12\Jobsheet11/SIAKAD11.java)
