# JOBSHEET 5: PEMILIHAN
Laporan Praktikum Daspro: Pemilihan
   
## Percobaan 1
Penerapan IF dan IF-ELSE untuk Mencetak KRS
   
1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?
    * Pada struktur tersebut tidak memerlukan operator relasional karena struktur IF (uktlunas) langsung mengevaluasi nilai boolean (true/false) variabel uktLunas.
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
    * Program tidak menampilkan apa-appa karena sebelumnya tidak ada perintah jika nilai diisi dengan false.
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi program tersebut dengan menambahkan struktur ELSE!   
   * ![ifCetakKRS11](https://github.com/dhafirtibast/PraktikumDaspro/blob/main/Minggu7/jobsheet5/ifCetakKRS11.png "Modifikasi Percobaan 1")
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 1”

## Percobaan 2   
Switch-case untuk mencetak KRS   
   
1. Apa fungsi dari sintaks break?   
    Fungsi sintaks break adalah untuk keluar dari alur jika kondisi sudah  terpenuhi.
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?   
    Untuk membuat tindakan apabila tidak ada CASE yang sesuai.
3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah dibuat ke dalam bentuk IF-ELSE IF-ELSE.   
   * ![ifElseCetakKRS11](https://github.com/dhafirtibast/PraktikumDaspro/blob/main/Minggu7/jobsheet5/ifElseCetakKRS11.png "Transformasi SWITCH-CASE ke IF-ELSE IF-ELSE")
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2”   
   
## Percobaan 3   
Nested IF untuk Mengecek Syarat Ujian Skripsi  
   
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
    Jika mahasiswa menjawab "No", maka program akan masuk ke bagian else:

       else {
       pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
       }
2. Jelaskan maksud dari potongan kode berikut!   
   
         if (bimbinganP1 >= 8 && bimbinganP2 >= 4){}
       
    - Potongan kode tersebut adalah kondisi utama untuk menentukan apakah mahasiswa memenuhi syarat log bimbingan
    - bimbinganP1 >= 8 berarti Mahasiswa harus sudah bimbingan minimal 8 kali dengan Pembimbing 1
    - bimbinganP2 >= 4 berarti Mahasiswa harus sudah bimbingan minimal 4 kali dengan Pembimbing 2
    - Operator && berarti keduanya harus terpenuhi agar kondisi if bernilai true   
    Jika kondisi ini benar, maka mahasiswa boleh mendaftar ujian skripsi

4. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!   

      * Langkah 1: Memeriksa input (Ya/Tidak). Apabila input adalah "Ya", maka lanjut ke log bimbingan. Jika "Tidak", maka langsung gagal dengan pesan "Gagal! Mahasiswa masih memiliki tanggungan kompen".
      * Langkah 2: Memeriksa jumlah log bimbingan.
           - bimbinganP1 >= 8 && bimbinganP2 >= 4; jika log bimbinganP1 lebih dari sama dengan 8 dan log bimbinganP2 lebih dari sama dengan 4, maka semua syarat terpenuhi.
           - bimbinganP1 < 8 && bimbinganP2 < 4; jika log bimbinganP1 kuraang dari 8 dan log bimbinganP2 kurang dari 4, maka output "Gagal! Keduanya belum cukup".
           - bimbinganP1 < 8; jika log bimbinganP1 kurang dari 8, maka output "Gagal! P1 belum cukup".
           - bimbinganP2 < 4; jika log bimbinganP2 kurang dari 4, maka output "Gagal! P2 belum cukup".

