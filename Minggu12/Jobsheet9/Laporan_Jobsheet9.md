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
* ![Percobaan 1](url "Pertanyaan 3")     
     
Statement tersebut bermaksud untuk menampilkan elemen array menggunakan perulangan.   
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?     
Program akan menampilkan error "Exception in thread 'main' java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4". Hal ini disebabkan oleh kondisi menyatakan 4 sebagai true sedangkan rentang indeks hanya 0-3.
