<h1 align="center">
Laporan Praktikum Jobsheet 9
</h1>
Laporan Praktikum Materi Array 1 Dimensi.   
   
Nama: Dhafir Tsabit    
NIM: 254107020148   
Kelas: TI-1C   
No. Absen: 11   
   
## Percobaan 1
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
- Program akan error dan menampilkan pesan "Type mismatch: cannot convert from double to int". Hal tersebut terjadi karena elemen tidak sesuai dengan deklarasi tipe data.  
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array. 
```java
public class ArrayBilangan11 {
    public static void main(String[] args) {
        int[] bil = {5, 13, -7, 17};

        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }
    }
}
```
3. Ubah statement pada langkah No 4 menjadi seperti berikut 
```java
for (int i = 0; i < 4; i++) {
    System.out.println(bil[i]);
}
```
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.    
* ![Percobaan 1](https://github.com/dhafirtibast/PraktikumDaspro/blob/main/Minggu12/Jobsheet9/Pertanyaan3_Percobaan1.png "Pertanyaan 3")     
Statement tersebut bermaksud untuk menampilkan elemen array menggunakan perulangan.   
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?     
Program akan menampilkan error "Exception in thread 'main' java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4". Hal ini disebabkan oleh kondisi menyatakan 4 sebagai true sedangkan rentang indeks hanya 0-3.
    
## Percobaan 2
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini: 
```java
for (int i = 0; i < nilaiAkhir.length; i++) {
    System.out.print("Masukkan nilai akhir ke-"+i+" : ");
    nilaiAkhir[i] = sc.nextInt();
}
```
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?   
Tidak terjadi perubahan karena statement tersebut berfungsi untuk mengulang proses sebanyak panjang array yaitu 10.    
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?    
Kondisi tersebut berfungsi untuk mengakses seluruh elemen array tanpa harus mengetahui panjang array secara manual.    
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70): 
```java
for (int i = 0; i < nilaiAkhir.length; i++) {
    if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke-"+i+" lulus!");
    }
}
```
Jalankan program dan jelaskan alur program!      
Perulangan kedua digunakan untuk memeriksa setiap elemen array. Jika nilai lebih dari 70, maka dianggap lulus dan ditampilkan ke layar.    
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output pada _jobsheet_!    
    
## Percobaan 3
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilai11.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70).    
```java
import java.util.Scanner;
public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int jmlMhsLulus = 0;
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jmlMhsLulus ++;
            }
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Jumlah mahasiswa lulus: "+jmlMhsLulus);

    }
}
```
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti pada _jobsheet_   
```java
import java.util.Scanner;
public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhsw = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhsw];
        int jmlMhsLulus = 0;
        int jmlMhsTdkLulus = 0;
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rata2MhsLulus;
        double rata2MhsTdkLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jmlMhsLulus ++;
                totalLulus += nilaiMhs[i];
            } else {
                jmlMhsTdkLulus++;
                totalTdkLulus += nilaiMhs[i];
            }
        }
        rata2MhsLulus = totalLulus/jmlMhsLulus;
        rata2MhsTdkLulus = totalTdkLulus/jmlMhsTdkLulus;
        System.out.println("Rata-rata nilai lulus = "+ rata2MhsLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+ rata2MhsTdkLulus);

    }
}
```
## Percobaan 4
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.    
Statement tersebut digunakan untuk menghentikan kode secara paksa jika kondisi sudah terpenuhi.    
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari.     
```java
import java.util.Scanner;
public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyakNilai = sc.nextInt();
        int[] arrNilai = new int[banyakNilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = 0;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+(hasil+1));
        System.out.println();    
    }
}
```    
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. 
```java
import java.util.Scanner;
public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyakNilai = sc.nextInt();
        int[] arrNilai = new int[banyakNilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = 0;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        if (hasil != 0) {
            System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+(hasil+1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");  
        }    
    }
}
```
