<h1 align="center">
Laporan Praktikum Jobsheet 14
</h1>
Laporan Praktikum Materi Fungsi Rekursif.   
   
Nama: Dhafir Tsabit    
NIM: 254107020148   
Kelas: TI-1C   
No. Absen: 11   
   
## Percobaan 1
### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?    
- Fungsi rekursif adalah sebuah fungsi yang di dalamnya memanggil fungsi itu sendiri hingga mencapai base case.
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!   
- Ya, hasilnya sama.
- Alur rekursif memanggil dirinya sendiri berulang kali sampai base case;    
    5 * faktorialRekursif(4) -> 4 * faktorialRekursif(3) -> ... -> 1 -> return    
- Alur iteratif menggunakan perulangan untuk menghitung faktorial;   
    i = 5 -> seleksi kondisi -> menghitung perkalian dan dimasukkan ke dalam variabel faktor -> i-- hingga kondisi false   

## Percobaan 2
### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!    
- Fungsi akan terus memanggil dirinya dengan parameter pangkat yang berkurang sampai base case atau nilai pangkat = 0. Setelah itu, fungsi mulai mengembalikan nilai hasil perhitungannya. 
2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya   
Contoh:    
hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32    
- Tambahan kode pada fungsi rekursif untuk menampilkan tiap bilangan yang dihasilkan dari perulangan rekursif:   
```java
static int hitungPangkat(int a, int b) {
    if (b == 0) {
        System.out.print("1");
        return (1);
    } else {
        System.out.print(a + "x");
        return (a * hitungPangkat(a, b - 1));
    }
}
```
- Tambahan kode pada fungsi main untuk menampilkan hasil pangkat:   
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bilangan, pangkat;
        
    System.out.print("Bilangan yang dihitung: ");
    bilangan = sc.nextInt();
    System.out.print("Pangkat: ");
    pangkat = sc.nextInt();
    
    // menampilkan hasil
    int hasil = hitungPangkat(bilangan, pangkat);
    System.out.print(" = " + hasil);
}
```
## Percobaan 3   
### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!    
- base case   
```java
if (tahun == 0) {
    return (saldo);
}
```   
- recursion call
```java
  else {
    return (1.11 * hitungLaba(saldo, tahun-1));
  }
```
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3)   
- Trace fase ekspansi:   
hitungLaba(100000,3)   
= 1.11 * hitungLaba(100000,2)   
= 1.11 * (1.11 * hitungLaba(100000,1))   
= 1.11 * (1.11 * (1.11 * hitungLaba(100000,0)))   
= 1.11 * (1.11 * (1.11 * 100000))   
- Trace fase subsitusi:    
= 1.11 * (1.11 * (1.11 * 100000))   
= 1.11 * (1.11 * 111000)   
= 1.11 * 123210   
= 136763.10   