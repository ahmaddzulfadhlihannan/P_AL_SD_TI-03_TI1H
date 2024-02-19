# Pertemuan 2 Praktikum Algoritma dan Struktur Data
<img src = "Logo Polinema (Politeknik Negeri Malang).png">  

Nama : AHMAD DZUL FADHLI HANNAN  
Nomor : 03  
Kelas : TI1H  
NIM : 2341720106

## 1. Tujuan Praktikum
1. Mengenal objek dan class sebagai konsep mendasar pada pemrograman berorientasi objek
2. Mendeklarasikan class, atribut dan method
3. Membuat objek (instansiasi)
4. Mengakses atribut dan method dari suatu objek
5. Menerapkan konstruktor

## 2. Praktikum
### 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method
#### 2.1.1 Langkah-langkah
#### 2.1.2 Verifikasi Hasil Percobaan
<img src = "image.png">

#### 2.1.3 Pertanyaan
1. Sebutkan dua karakteristik class atau object!
Jawaban :  Mempunyai nilai (variabel/ atribut) dan melakukan sesuatu (method/ fungsi)
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya!
Terdapat 5 atribut, anatarnya judul, pengarang, halaman, stok, dan harga.
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
Terdapat 4 method, antaranya tampilan, terjual, restok, dan gantiHarga
4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?
Karena dalam method terdapat objek stok yang memiliki tipe data yang sama dengan jml yaitu int.
6. Commit dan push kode program ke Github

### 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
#### 2.2.1 Langkah-langkah
#### 2.2.2 Verifikasi Hasil Percobaan

#### 2.2.3 Pertanyaan
