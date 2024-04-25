# Pertemuan 8 Praktikum Algoritma dan Struktur Data
<img src = "Logo Polinema (Politeknik Negeri Malang).png">  

Nama : AHMAD DZUL FADHLI HANNAN  
Nomor : 03  
Kelas : TI1H  
NIM : 2341720106

## 1. Tujuan Praktikum
1.	Membuat struktur data Stack
2.	Menerapkan algoritma Stack ke dalam program

 
## 2. Praktikum
### 2.1 Percobaan 1 : Penyimpanan Tumpukan Barang dalam Gudang
#### 2.1.1 Langkah-langkah
#### 2.1.2 Verifikasi Hasil Percobaan  
Data Ditemukan  
<img src = "image.png">  


#### 2.1.3 Pertanyaan
1.	Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki?
Jawaban : Pada class Gudang method tampilkanBarang() bagian kode berikut :  
<img src = "image-1.png">  
Diubah menjadi seperti berikut :  
<img src = "image-2.png">  
Supaya perulangan dimulai dari indeks terakhir. Sehingga menampilkan dari tumpukan barang teratas sampai ke bawah :  
<img src = "image-3.png">  
2.	Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya!  
Jawaban : Ada 7 data yang dapat ditampung di dalam tumpukan.  
<img src = "image-4.png">  
3.	Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya?  
Jawaban : 
4.	Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang!
5.	Commit dan push kode program ke Github



### 2.2 Percobaan 2 :  Searching / Pencarian Menggunakan Binary Search 
#### 2.2.1 Langkah-langkah
#### 2.2.2 Verifikasi Hasil Percobaan  
<img src = "image-6.png">  


#### 2.2.3 Pertanyaan  
1.	Tunjukkan pada kode program yang mana proses divide dijalankan!  
<img src = image-7.png>  

2.	Tunjukkan pada kode program yang mana proses conquer dijalankan!  
<img src = image-8.png>  
3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?  
<img src = image-9.png>  
<img src = image-10.png>  
Meskipun urutan kode buku tidak urut, algoritma binary search tetap dapat menemukan data secara tepat karena algoritma ini tidak bergantung pada urutan data. Algoritma bekerja dengan cara membagi data menjadi dua bagian dan kemudian mencari bagian mana yang kemungkinan berisi data yang dicari. Proses ini diulang terus menerus hingga data yang dicari ditemukan atau seluruh data telah diperiksa.  

4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!  
Jawaban : Tidak sesuai  
<img src = image-11.png>  
Kode setelah diubah  
<img src = image-12.png>  


### 2.3 Percobaan 3: Percobaan Pengayaan Divide and Conquer 
#### 2.3.1 Langkah-langkah
#### 2.3.2 Verifikasi Hasil Percobaan
<img src = "image-13.png">  

## 2.3 Latihan Praktikum
1.	Modifikasi percobaan searching diatas dengan ketentuan berikut ini  
-	Ubah tipe data dari kode Buku yang awalnya int menjadi String  
-	Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan sequential search dan binary search.  

Jawaban :  
Kode Program :  
<img src = "image-14.png">  
<img src = "image-15.png">  
<img src = "image-16.png">  
Running :  
<img src = "image-17.png">  


2.	Modifikasi percobaan searching diatas dengan ketentuan berikut ini
 
-	Tambahkan method pencarian judul buku menggunakan sequential search dan binary search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga ketika input data acak, maka algoritma searching akan tetap berjalan
-	Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang diberikan!  
Jawaban :  
Kode Program  
<img src = "image-19.png">  
<img src = "image-20.png">  
<img src = "image-21.png">  
<img src = "image-22.png">  
<img src = "image-23.png">  

Running  
<img src = "image-18.png">

