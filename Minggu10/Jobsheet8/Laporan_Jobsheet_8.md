# Laporan Jobsheet 8: Perulangan 2
Laporan Praktikum Dasar Pemrograman: Nested Loop     

Nama: Dhafir Tsabit   
NIM: 254107020148   
Kelas: TI-1C   
No. Absen: 11   
   
###  Percobaan 1
1. Jika pada perulangan for, inisialisasi i = 1 diubah menjadi i = 0, apa akibatnya? Mengapa bisa demikian?     
    Jika inisialisasi diubah menjadi i = 0, maka iterasi atau perulangan kode terjadi sebanyak n+1 kali karena iterasi dimulai dari i = 0. 
2. Jika pada perulangan for, kondisi i <= n diubah menjadi i < n, bagaimana bentuk outputnya jika input n = 5? Mengapa hasilnya berbeda? 
    Jika kondisi diubah menjadi i < n dan input n = 5, maka output akan menampilkan 4 bintang. karena iterasi hanya akan dilakukan mulai i = 0 sampai i kurang dari n. 
3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian?     
    Apabila kondisi diubah menjadi i > n, maka perulangan tidak terjadi karena inisialisasi i = 1 dan n = 5 sehingga 1 > 5 bernilai false. Perulangan tidak akan terjadi jika kondisi bernilai false.
4. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?    
    Jika kondisi diubah menjadi i-- dan input n adalah angka di atas 0, maka kode akan selalu bernilai true sehingga program terus berjalan. Hal ini terjadi karena ketika n diberi nilai di atas 0 dan i-- (decrement) sehingga i semakin jauh dari nilai n.
5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola outputnya jika input n = 6? Apa yang menyebabkan perubahan tersebut?    
    Apabila diubah menjadi i += 2, ini berarti iterasi akan ditambah sebanyak 2 setelah kode dijalankan sehingga pola output akan melompat 2 langkah sekali.    
     
### Percobaan 2
1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?     
    Inisialisasi iOuter=0 akan menambah iterasi sehingga perulangan luar akan mengulang sebanyak n+1 kali.
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi i=1 diubah menjadi i = 0, apa yang akibatnya? Mengapa bisa demikian?     
    Inisialisasi i=0 akan menambah iterasi pada perulangan dalam sehingga pengulangan di dalam akan mengulang sebanyak n+1 kali.
3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?    
    Perulangan luar mengulang kelompok proses sedangkan perulangan dalam mengatur perulangan dalam kelompok proses.
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah 
perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?    
    Sintaks tersebut diperlukan untuk mencetak baris baru dari kode perulangan luar. Jika sintaks tersebut dihilangkan, maka output perulangan luar akan ditampilkan dalam satu baris.
5. Silakan commit dan push ke repository Anda.
### Percobaan 3
1. Perhatikan, apakah output yang dihasilkan dengan nilai n = 5 sesuai dengan tampilan berikut?      
        *      
        **      
        ***     
        ****      
        *****       
    - Tidak.
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.     
    - Ubah kondisi pada perulangan dalam menjadi seperti berikut agar mencetak bintang sejumlah 'i'   
        ```java
        while (j < i) {}
        ```
    - Tambahkan sintaks berikut ke dalam perulangan luar untuk mencetak baris baru
    ```java
    System.out.println();
    ```
3. Silakan commit dan push ke repository Anda. 
4. Jelaskan peran masing-masing variabel i dan j dalam program ini. Mengapa j di-set ulang ke 0 di awal setiap iterasi outer loop? Apa yang akan terjadi jika j tidak di-reset?     
    - Peran 'i' mengatur berapa kali baris dicetak.
    - Peran 'j' mengatur berapa banyak bintang per baris.
    - Dan 'j' harus di-reset ke 0 setiap iterasi luar agar perulangan dalam bisa berjalan dari awal lagi dan mencetak bintang sesuai nilai i.

### Percobaan 4
1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan mengapa inisialisasinya (total = 0) berada di dalam outer loop, bukan di luar.     
    - Setiap kali perulangan luar 'i' berjalan, program memproses satu kelompok. Di awal setiap iterasi, variabel 'totalNilai' akan di-set ke 0, lalu perulangan 'j' akan meminta input 5 nilai lalu menjumlahkannya ke variabel 'totalNilai'.     
    - Agar nilai setiap kelompok dapat dihitung secara mandiri, maka variabel 'totalNilai' diletakkan di dalam outer loop. Jika diletakkan di luar, maka pada iterasi selanjutnya, nilai kelompok akan terakumulasi dengan nilai kelompok sebelumnya.  
2. Modifikasi program tersebut, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut.   
Modifikasi:    
```java
import java.util.Scanner;
public class NilaiKelompok11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float rataTertinggi = 0;
        int nomorKelompokTop = 0;
        int i = 1;
        while (i <= 2) {
            System.out.println("Kelompok " + i);
 
            float totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");
                int nlai = sc.nextInt();
                totalNilai += nlai;
            }
            float rataNilai = totalNilai/5;
            System.out.print("Kelompok " + i + ": ");
            System.out.println("nilai rata-rata = " + rataNilai);

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                nomorKelompokTop = i;
            }
            i++;
        }
        System.out.print("Kelompok dengan rata-rata tertinggi adalah Kelompok ");
        System.out.println(nomorKelompokTop + " dengan rata-rata " + rataTertinggi);
    }
}
```   


